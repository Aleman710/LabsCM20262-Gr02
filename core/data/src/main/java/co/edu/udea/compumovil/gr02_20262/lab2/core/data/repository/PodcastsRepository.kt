/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.edu.udea.compumovil.gr02_20262.lab2.core.data.repository

import co.edu.udea.compumovil.gr02_20262.lab2.core.data.Dispatcher
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.JetcasterDispatchers
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.TransactionRunner
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.Podcast
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.PodcastRssResponse
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.PodcastsFetcher
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.SampleFeeds
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.api.PodcastRestService
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

/**
 * Data repository for Podcasts supporting both local database and REST web services.
 */
class PodcastsRepository @Inject constructor(
    private val podcastsFetcher: PodcastsFetcher,
    private val podcastRestService: PodcastRestService,
    private val podcastStore: PodcastStore,
    private val episodeStore: EpisodeStore,
    private val categoryStore: CategoryStore,
    private val transactionRunner: TransactionRunner,
    @Dispatcher(JetcasterDispatchers.Main) mainDispatcher: CoroutineDispatcher,
) {
    private var refreshingJob: Job? = null

    private val scope = CoroutineScope(mainDispatcher)

    suspend fun updatePodcasts(force: Boolean) {
        if (refreshingJob?.isActive == true) {
            refreshingJob?.join()
        } else if (force || podcastStore.isEmpty()) {
            val job = scope.launch {
                // Now fetch the podcasts, and add each to each store
                podcastsFetcher(SampleFeeds)
                    .filter { it is PodcastRssResponse.Success }
                    .map { it as PodcastRssResponse.Success }
                    .collect { (podcast, episodes, categories) ->
                        transactionRunner {
                            podcastStore.addPodcast(podcast)
                            episodeStore.addEpisodes(episodes)

                            categories.forEach { category ->
                                // First insert the category
                                val categoryId = categoryStore.addCategory(category)
                                // Now we can add the podcast to the category
                                categoryStore.addPodcastToCategory(
                                    podcastUri = podcast.uri,
                                    categoryId = categoryId,
                                )
                            }
                        }
                    }
            }
            refreshingJob = job
            // We need to wait here for the job to finish, otherwise the coroutine completes ~immediatelly
            job.join()
        }
    }

    /**
     * Searches podcasts online using the REST API (iTunes Search API).
     */
    suspend fun searchPodcastsOnline(query: String): List<Podcast> {
        return try {
            val response = podcastRestService.searchPodcasts(term = query)
            response.results.mapNotNull { dto ->
                val feed = dto.feedUrl ?: return@mapNotNull null
                Podcast(
                    uri = feed,
                    title = dto.collectionName ?: "Podcast",
                    author = dto.artistName,
                    imageUrl = dto.artworkUrl600 ?: dto.artworkUrl100,
                    description = dto.primaryGenreName ?: "Podcast",
                )
            }
        } catch (_: Exception) {
            emptyList()
        }
    }

    /**
     * Follows an online podcast and saves it to the local Room database.
     */
    suspend fun followPodcast(podcast: Podcast) {
        transactionRunner {
            podcastStore.addPodcast(podcast)
            podcastStore.togglePodcastFollowed(podcast.uri)
        }
    }
}
