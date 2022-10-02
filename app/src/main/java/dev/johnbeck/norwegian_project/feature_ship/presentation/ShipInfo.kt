package dev.johnbeck.norwegian_project.feature_ship.presentation

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.johnbeck.norwegian_project.BLISS
import dev.johnbeck.norwegian_project.ESCAPE
import dev.johnbeck.norwegian_project.SKY
import org.koin.androidx.compose.koinViewModel

@Composable
fun ShipInfo(){

    val viewModel = koinViewModel<ShipViewModel>()
    val state = viewModel.shipState


    if(state.isLoading){
        Log.e("loading", state.isLoading.toString())
        CircularProgressIndicator()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center) {

        Text("Ship Name: ${state.shipData?.shipName ?: ""}")
        Spacer(modifier = Modifier.height(4.dp))
        Text("Passenger Capacity: ${state.shipData?.shipFacts?.passengerCapacity ?: ""}")
        Spacer(modifier = Modifier.height(4.dp))
        Text("Crew: ${state.shipData?.shipFacts?.crew ?: ""}")
        Spacer(modifier = Modifier.height(4.dp))
        Text("Inaugural Date: ${state.shipData?.shipFacts?.inauguralDate ?: ""}")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )  {
            Button(onClick = { viewModel.getShip(SKY) }){
                Text("SKY")
            }
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = { viewModel.getShip(BLISS) }){
                Text("BLISS")
            }
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = { viewModel.getShip(ESCAPE) }){
                Text("ESCAPE")
            }
        }
    }
}