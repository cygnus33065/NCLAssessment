package dev.johnbeck.norwegian_project.feature_ship.domain.use_case

import dev.johnbeck.norwegian_project.data.model.Ship
import dev.johnbeck.norwegian_project.feature_ship.domain.repository.ShipRepository
import dev.johnbeck.norwegian_project.util.Resource


class GetShipInfo(
    private val repository: ShipRepository
) {
    suspend fun getShipInfo(shipName: String): Resource<Ship>  {
        return try {
            val ship = repository.getShipInfo(shipName)
            Resource.Success(ship)
        }catch(e: Throwable){
            Resource.Error(message = e.localizedMessage ?: "An unexpected error has occurred")
        }
    }
}