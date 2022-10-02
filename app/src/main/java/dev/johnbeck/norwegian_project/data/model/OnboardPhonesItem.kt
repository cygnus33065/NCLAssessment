package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class OnboardPhonesItem(@SerializedName("phone")
                             val phone: String = "",
                             @SerializedName("name")
                             val name: String = "",
                             @SerializedName("locationSharingEnabled")
                             val locationSharingEnabled: Boolean = false,
                             @SerializedName("venueCode")
                             val venueCode: String = "",
                             @SerializedName("mobileName")
                             val mobileName: String = "",
                             @SerializedName("token")
                             val token: String = "")