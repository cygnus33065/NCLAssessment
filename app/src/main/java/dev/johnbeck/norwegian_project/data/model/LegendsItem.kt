package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class LegendsItem(@SerializedName("legendImageLink")
                       val legendImageLink: String = "",
                       @SerializedName("name")
                       val name: String = "",
                       @SerializedName("description")
                       val description: String = "",
                       @SerializedName("legendWeight")
                       val legendWeight: String = "")