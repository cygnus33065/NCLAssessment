package dev.johnbeck.norwegian_project.feature_ship.presentation.util

import dev.johnbeck.norwegian_project.data.model.Ship

data class ShipState(
    val isLoading: Boolean = false,
    val shipData: Ship? = null,
    val error: String = ""
)
