package com.nnapps.meditationuijetpackcompose

import androidx.annotation.DrawableRes

data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColour: androidx.compose.ui.graphics.Color,
    val mediumColour: androidx.compose.ui.graphics.Color,
    val darkColour: androidx.compose.ui.graphics.Color
)