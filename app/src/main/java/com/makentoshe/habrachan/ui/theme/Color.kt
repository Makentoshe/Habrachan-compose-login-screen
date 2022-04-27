package com.makentoshe.habrachan.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val HabrBrand = Color(0xFF9CC2CE)
val HabrBrandVariant = Color(0xFF728E96)

val Colors.brand get() = HabrBrand
val Colors.onBrand get() = Color.White

val Colors.brandVariant get() = HabrBrandVariant
val Colors.onBrandVariant get() = Color.White

val Colors.dimmed get() = if (isLight) Color(0x99000000) else Color(0x80ffffff)