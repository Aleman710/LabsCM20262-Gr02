/*
 * Copyright 2024 The Android Open Source Project
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

package co.edu.udea.compumovil.gr02_20262.lab2.core.di

import co.edu.udea.compumovil.gr02_20262.lab2.core.data.Dispatcher
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.JetcasterDispatchers
import co.edu.udea.compumovil.gr02_20262.lab2.core.player.EpisodePlayer
import co.edu.udea.compumovil.gr02_20262.lab2.core.player.MockEpisodePlayer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineDispatcher

@Module
@InstallIn(SingletonComponent::class)
object DomainDiModule {
    @Provides
    @Singleton
    fun provideEpisodePlayer(@Dispatcher(JetcasterDispatchers.Main) mainDispatcher: CoroutineDispatcher): EpisodePlayer =
        MockEpisodePlayer(mainDispatcher)
}
