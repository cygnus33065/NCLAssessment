package dev.johnbeck.norwegian_project.feature_ship.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.johnbeck.norwegian_project.feature_ship.domain.use_case.GetShipInfo
import dev.johnbeck.norwegian_project.feature_ship.presentation.util.ShipState
import dev.johnbeck.norwegian_project.util.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShipViewModel(
    private val getShipInfoUseCase: GetShipInfo
) : ViewModel() {

    var shipState by mutableStateOf(ShipState())
        private set

    fun getShip(shipName: String) {

        viewModelScope.launch(Dispatchers.IO) {
            val ship = getShipInfoUseCase.getShipInfo(shipName)
            shipState = ShipState(isLoading = true)
            shipState = when (ship) {
                is Resource.Success -> ShipState(shipData = ship.data)
                is Resource.Error -> ShipState(error = ship.message!!)
                is Resource.Loading -> ShipState(isLoading = true)
            }
        }
    }
}