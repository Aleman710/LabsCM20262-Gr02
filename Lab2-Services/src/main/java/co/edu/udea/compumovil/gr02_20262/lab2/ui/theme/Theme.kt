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

package co.edu.udea.compumovil.gr02_20262.lab2.ui.theme

import android.os.Build
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.MotionScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.JetcasterShapes
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.JetcasterTypography
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.backgroundLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.errorLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseOnSurfaceLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inversePrimaryLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.inverseSurfaceLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onBackgroundLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onErrorLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onPrimaryLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSecondaryLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onSurfaceVariantLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.onTertiaryLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.outlineVariantLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.primaryLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.scrimLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.secondaryLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceBrightLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerHighestLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceContainerLowestLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceDimLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.surfaceVariantLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryContainerLightMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryDark
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryDarkHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryDarkMediumContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryLight
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryLightHighContrast
import co.edu.udea.compumovil.gr02_20262.lab2.designsystem.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
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

private val darkScheme = darkColorScheme(
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

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun JetcasterTheme(dynamicColor: Boolean = false, content: @Composable () -> Unit) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            dynamicDarkColorScheme(context)
        }

        else -> darkScheme
    }

    MaterialExpressiveTheme(
        colorScheme = colorScheme,
        motionScheme = MotionScheme.expressive(),
        shapes = JetcasterShapes,
        typography = JetcasterTypography,
        content = content,
    )
}
