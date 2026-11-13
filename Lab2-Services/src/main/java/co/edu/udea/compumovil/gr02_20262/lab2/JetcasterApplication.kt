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

package co.edu.udea.compumovil.gr02_20262.lab2

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import coil.ImageLoader
import coil.ImageLoaderFactory
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.work.WorkManagerSyncManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * Application setup initializing ImageLoader, Hilt, and WorkManager background sync.
 */
@HiltAndroidApp
class JetcasterApplication :
    Application(),
    ImageLoaderFactory,
    Configuration.Provider {

    @Inject lateinit var imageLoader: ImageLoader
    @Inject lateinit var workerFactory: HiltWorkerFactory
    @Inject lateinit var syncManager: WorkManagerSyncManager

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()

    override fun onCreate() {
        super.onCreate()
        // Initialize periodic background sync task with WorkManager
        syncManager.schedulePeriodicSync()
    }

    override fun newImageLoader(): ImageLoader = imageLoader
}
