package dev.johnbeck.norwegian_project.di

import dev.johnbeck.norwegian_project.BASE_URL
import dev.johnbeck.norwegian_project.data.remote.api.ShipApi
import dev.johnbeck.norwegian_project.feature_ship.domain.repository.ShipRepository
import dev.johnbeck.norwegian_project.feature_ship.data.ShipRepositoryImpl
import dev.johnbeck.norwegian_project.feature_ship.domain.use_case.GetShipInfo
import dev.johnbeck.norwegian_project.feature_ship.presentation.ShipViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {

    single<ShipApi>{
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ShipApi::class.java)
    }

    single<ShipRepository> { ShipRepositoryImpl(get()) }
    single {GetShipInfo(get())}
    viewModel{ShipViewModel(get())}
}