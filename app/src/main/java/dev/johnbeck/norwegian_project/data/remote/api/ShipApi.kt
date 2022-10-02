package dev.johnbeck.norwegian_project.data.remote.api

import dev.johnbeck.norwegian_project.data.model.Ship
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ShipApi {

    @GET("{shipName}")
    suspend fun getShipInfo(
        @Path("shipName") shipName: String
    ): Ship
}