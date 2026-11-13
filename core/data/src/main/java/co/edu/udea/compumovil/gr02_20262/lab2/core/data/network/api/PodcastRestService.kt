package co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.api

import co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.model.ItunesSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * REST API Service consuming the iTunes Search API to fetch live podcasts.
 * Base URL: https://itunes.apple.com/
 */
interface PodcastRestService {

    @GET("search")
    suspend fun searchPodcasts(
        @Query("term") term: String,
        @Query("entity") entity: String = "podcast",
        @Query("limit") limit: Int = 25,
    ): ItunesSearchResponse
}
