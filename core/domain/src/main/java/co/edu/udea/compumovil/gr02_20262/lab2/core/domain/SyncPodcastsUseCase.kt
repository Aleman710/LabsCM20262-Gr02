package co.edu.udea.compumovil.gr02_20262.lab2.core.domain

import androidx.work.WorkInfo
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.work.WorkManagerSyncManager
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

/**
 * UseCase to manage background sync with WorkManager.
 */
class SyncPodcastsUseCase @Inject constructor(
    private val syncManager: WorkManagerSyncManager,
) {
    fun schedulePeriodicSync(hours: Long = 6) {
        syncManager.schedulePeriodicSync(hours)
    }

    fun triggerImmediateSync() {
        syncManager.triggerImmediateSync()
    }

    fun observeSyncStatus(): Flow<List<WorkInfo>> {
        return syncManager.observeSyncStatus()
    }
}
