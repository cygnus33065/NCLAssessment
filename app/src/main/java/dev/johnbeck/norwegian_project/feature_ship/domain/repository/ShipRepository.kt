package dev.johnbeck.norwegian_project.feature_ship.domain.repository

import dev.johnbeck.norwegian_project.data.model.Ship

interface ShipRepository {
    suspend fun getShipInfo(shipName: String): Ship
}