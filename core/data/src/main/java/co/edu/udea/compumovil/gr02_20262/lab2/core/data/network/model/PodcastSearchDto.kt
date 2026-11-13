package co.edu.udea.compumovil.gr02_20262.lab2.core.data.network.model

import com.google.gson.annotations.SerializedName

/**
 * Data Transfer Objects representing iTunes Search API response.
 */
data class ItunesSearchResponse(
    @SerializedName("resultCount") val resultCount: Int = 0,
    @SerializedName("results") val results: List<ItunesPodcastDto> = emptyList(),
)

data class ItunesPodcastDto(
    @SerializedName("collectionId") val collectionId: Long = 0,
    @SerializedName("collectionName") val collectionName: String? = null,
    @SerializedName("artistName") val artistName: String? = null,
    @SerializedName("feedUrl") val feedUrl: String? = null,
    @SerializedName("artworkUrl100") val artworkUrl100: String? = null,
    @SerializedName("artworkUrl600") val artworkUrl600: String? = null,
    @SerializedName("primaryGenreName") val primaryGenreName: String? = null,
    @SerializedName("releaseDate") val releaseDate: String? = null,
    @SerializedName("country") val country: String? = null,
)
