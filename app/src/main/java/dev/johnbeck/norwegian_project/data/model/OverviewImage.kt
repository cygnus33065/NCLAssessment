package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class OverviewImage(@SerializedName("imagePath")
                         val imagePath: String = "",
                         @SerializedName("alt")
                         val alt: String = "",
                         @SerializedName("title")
                         val title: String = "")