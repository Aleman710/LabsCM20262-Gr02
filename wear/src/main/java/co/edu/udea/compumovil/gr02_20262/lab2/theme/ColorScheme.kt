/*
 * Copyright 2021 The Android Open Source Project
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

package co.edu.udea.compumovil.gr02_20262.lab2.theme

import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material3.ColorScheme
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryDark

internal val wearColorPalette: ColorScheme = ColorScheme(
    primary = primaryDark,
    primaryDim = primaryDark,
    onPrimary = Color(0xFF542104),
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    secondaryDim = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDark,
    onBackground = onBackgroundDarkMediumContrast,
    onSurface = onSurfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDark,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
)
