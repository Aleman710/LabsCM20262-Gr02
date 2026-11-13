package co.edu.udea.compumovil.gr02_20262.lab2.ui.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.Podcast
import co.edu.udea.compumovil.gr02_20262.lab2.core.domain.SearchPodcastsUseCase
import co.edu.udea.compumovil.gr02_20262.lab2.core.domain.SyncPodcastsUseCase
import co.edu.udea.compumovil.gr02_20262.lab2.notification.PodcastNotificationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class SearchUiState(
    val query: String = "",
    val isLoading: Boolean = false,
    val results: List<Podcast> = emptyList(),
    val message: String? = null,
)

@HiltViewModel
class SearchRestViewModel @Inject constructor(
    private val searchPodcastsUseCase: SearchPodcastsUseCase,
    private val syncPodcastsUseCase: SyncPodcastsUseCase,
    private val notificationManager: PodcastNotificationManager,
) : ViewModel() {

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    fun onQueryChange(newQuery: String) {
        _uiState.update { it.copy(query = newQuery) }
    }

    fun performSearch() {
        val query = _uiState.value.query
        if (query.isBlank()) return

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, message = null) }
            val results = searchPodcastsUseCase.search(query)
            _uiState.update {
                it.copy(
                    isLoading = false,
                    results = results,
                    message = if (results.isEmpty()) "No se encontraron podcasts" else null,
                )
            }
        }
    }

    fun followPodcast(podcast: Podcast) {
        viewModelScope.launch {
            searchPodcastsUseCase.follow(podcast)
            _uiState.update { it.copy(message = "¡Suscrito a ${podcast.title}!") }
            notificationManager.showSyncNotification(
                "Podcast suscrito",
                "Te has suscrito exitosamente a ${podcast.title}"
            )
        }
    }

    fun triggerBackgroundSync() {
        syncPodcastsUseCase.triggerImmediateSync()
        _uiState.update { it.copy(message = "Sincronización en segundo plano iniciada con WorkManager") }
        notificationManager.showSyncNotification(
            "Sincronización iniciada",
            "WorkManager está sincronizando podcasts y episodios en segundo plano"
        )
    }

    fun clearMessage() {
        _uiState.update { it.copy(message = null) }
    }
}
