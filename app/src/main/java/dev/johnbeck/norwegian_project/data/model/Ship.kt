package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class Ship(@SerializedName("code")
                val code: String = "",
                @SerializedName("stateroomMetas")
                val stateroomMetas: List<StateroomMetasItem>?,
                @SerializedName("recategorizationDate")
                val recategorizationDate: String = "",
                @SerializedName("shipFacts")
                val shipFacts: ShipFacts,
                @SerializedName("imagePath")
                val imagePath: List<String>?,
                @SerializedName("wesbCode")
                val wesbCode: String = "",
                @SerializedName("allowedGuestCount")
                val allowedGuestCount: Int = 0,
                @SerializedName("shipName")
                val shipName: String = "",
                @SerializedName("recategorizationDefaultView")
                val recategorizationDefaultView: String = "",
                @SerializedName("shipDescriptionHtml")
                val shipDescriptionHtml: String = "",
                @SerializedName("whatsIncluded")
                val whatsIncluded: List<String>?,
                @SerializedName("features")
                val features: String = "",
                @SerializedName("legends")
                val legends: List<LegendsItem>?,
                @SerializedName("highlights")
                val highlights: List<String>?,
                @SerializedName("answersHeadlineHtml")
                val answersHeadlineHtml: String? = null,
                @SerializedName("accessCode")
                val accessCode: String = "",
                @SerializedName("bgeImagePath")
                val bgeImagePath: String = "",
                @SerializedName("name")
                val name: String = "",
                @SerializedName("onboard_phones")
                val onboardPhones: List<OnboardPhonesItem>?,
                @SerializedName("storiesHeadlineHtml")
                val storiesHeadlineHtml: String? = null,
                @SerializedName("shipDescription")
                val shipDescription: String = "")