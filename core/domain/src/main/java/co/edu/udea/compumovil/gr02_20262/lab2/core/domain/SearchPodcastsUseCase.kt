package co.edu.udea.compumovil.gr02_20262.lab2.core.domain

import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.Podcast
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.repository.PodcastsRepository
import javax.inject.Inject

/**
 * UseCase to search podcasts using the REST web service and follow/save them to Room.
 */
class SearchPodcastsUseCase @Inject constructor(
    private val podcastsRepository: PodcastsRepository,
) {
    suspend fun search(query: String): List<Podcast> {
        if (query.isBlank()) return emptyList()
        return podcastsRepository.searchPodcastsOnline(query.trim())
    }

    suspend fun follow(podcast: Podcast) {
        podcastsRepository.followPodcast(podcast)
    }
}
