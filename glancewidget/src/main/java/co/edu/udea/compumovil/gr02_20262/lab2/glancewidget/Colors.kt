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

package co.edu.udea.compumovil.gr02_20262.lab2.glancewidget

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryLight

/**
 * Todo, this is copied from the core module. Refactor colors out of that so we can reference them.
 */
private val lightJetcasterColors = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

/**
 * Todo, this is copied from the core module. Refactor colors out of that so we can reference them.
 */
internal val DarkJetcasterColors = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)
