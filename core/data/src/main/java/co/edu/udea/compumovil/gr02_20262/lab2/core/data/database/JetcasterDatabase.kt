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

package co.edu.udea.compumovil.gr02_20262.lab2.core.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.CategoriesDao
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.EpisodesDao
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.PodcastCategoryEntryDao
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.PodcastFollowedEntryDao
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.PodcastsDao
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.dao.TransactionRunnerDao
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.Category
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.Episode
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.Podcast
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.PodcastCategoryEntry
import co.edu.udea.compumovil.gr02_20262.lab2.core.data.database.model.PodcastFollowedEntry

/**
 * The [RoomDatabase] we use in this app.
 */
@Database(
    entities = [
        Podcast::class,
        Episode::class,
        PodcastCategoryEntry::class,
        Category::class,
        PodcastFollowedEntry::class,
    ],
    version = 1,
    exportSchema = false,
)
@TypeConverters(DateTimeTypeConverters::class)
abstract class JetcasterDatabase : RoomDatabase() {
    abstract fun podcastsDao(): PodcastsDao
    abstract fun episodesDao(): EpisodesDao
    abstract fun categoriesDao(): CategoriesDao
    abstract fun podcastCategoryEntryDao(): PodcastCategoryEntryDao
    abstract fun transactionRunnerDao(): TransactionRunnerDao
    abstract fun podcastFollowedEntryDao(): PodcastFollowedEntryDao
}
