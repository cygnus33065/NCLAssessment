package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class ShipFacts(@SerializedName("passengerCapacity")
                     val passengerCapacity: String = "",
                     @SerializedName("overallLength")
                     val overallLength: String = "",
                     @SerializedName("cruiseSpeed")
                     val cruiseSpeed: String = "",
                     @SerializedName("maxBeam")
                     val maxBeam: String = "",
                     @SerializedName("engines")
                     val engines: String = "",
                     @SerializedName("remodeledDate")
                     val remodeledDate: String? = null,
                     @SerializedName("draft")
                     val draft: String = "",
                     @SerializedName("inauguralDate")
                     val inauguralDate: String = "",
                     @SerializedName("grossRegisterTonnage")
                     val grossRegisterTonnage: String = "",
                     @SerializedName("crew")
                     val crew: String = "")