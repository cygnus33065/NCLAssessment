package dev.johnbeck.norwegian_project.feature_ship.data

import dev.johnbeck.norwegian_project.data.model.Ship
import dev.johnbeck.norwegian_project.data.remote.api.ShipApi
import dev.johnbeck.norwegian_project.feature_ship.domain.repository.ShipRepository

class ShipRepositoryImpl(
     val api: ShipApi
): ShipRepository {
   override suspend fun getShipInfo(shipName: String): Ship {
            return api.getShipInfo(shipName)
    }
}