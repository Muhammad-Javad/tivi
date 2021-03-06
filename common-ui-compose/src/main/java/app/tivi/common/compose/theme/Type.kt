/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.tivi.common.compose.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import app.tivi.common.compose.R

private val Inter = fontFamily(
    font(R.font.inter_300, FontWeight.Light),
    font(R.font.inter_400, FontWeight.Normal),
    font(R.font.inter_500, FontWeight.Medium),
    font(R.font.inter_700, FontWeight.Bold)
)

val TiviTypography = Typography(defaultFontFamily = Inter)
