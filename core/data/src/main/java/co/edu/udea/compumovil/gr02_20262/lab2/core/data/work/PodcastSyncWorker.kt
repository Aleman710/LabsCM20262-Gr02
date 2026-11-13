package co.edu.udea.compumovil.gr02_20262.lab2.core.data.work

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.repository.PodcastsRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * A CoroutineWorker responsible for periodic background synchronization of podcasts
 * and episodes, satisfying the WorkManager requirement of Lab 2.
 */
@HiltWorker
class PodcastSyncWorker @AssistedInject constructor(
    @Assisted private val appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val podcastsRepository: PodcastsRepository,
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            // Synchronize feeds and update Room database
            podcastsRepository.updatePodcasts(force = true)
            showSyncNotification()
            Result.success()
        } catch (e: Exception) {
            if (runAttemptCount < 3) {
                Result.retry()
            } else {
                Result.failure()
            }
        }
    }

    private fun showSyncNotification() {
        try {
            val channelId = "podcast_sync_channel"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val channel = NotificationChannel(
                    channelId,
                    "Sincronización en segundo plano",
                    NotificationManager.IMPORTANCE_DEFAULT,
                ).apply {
                    description = "Avisos de actualización periódica de WorkManager"
                }
                val notificationManager = appContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(channel)
            }

            val notification = NotificationCompat.Builder(appContext, channelId)
                .setSmallIcon(android.R.drawable.stat_notify_sync)
                .setContentTitle("Jetcaster: Sincronización en segundo plano")
                .setContentText("Los podcasts han sido actualizados exitosamente por WorkManager.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .build()

            val manager = NotificationManagerCompat.from(appContext)
            manager.notify(1002, notification)
        } catch (_: SecurityException) {
            // Ignored if notification permission is not granted
        }
    }

    companion object {
        const val WORK_NAME = "PodcastSyncWork"
    }
}
