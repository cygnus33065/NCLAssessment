package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class StateroomMetasItem(@SerializedName("code")
                              val code: String = "",
                              @SerializedName("view360Link")
                              val viewLink: String? = null,
                              @SerializedName("stateroomSubMetas")
                              val stateroomSubMetas: List<StateroomSubMetasItem>?,
                              @SerializedName("genericCode")
                              val genericCode: String = "",
                              @SerializedName("imagePath")
                              val imagePath: List<String>?,
                              @SerializedName("featureHighlights")
                              val featureHighlights: String = "",
                              @SerializedName("description")
                              val description: String = "",
                              @SerializedName("weight")
                              val weight: String = "",
                              @SerializedName("overview_image")
                              val overviewImage: OverviewImage,
                              @SerializedName("shortDescription")
                              val shortDescription: String = "",
                              @SerializedName("categorizationVersion")
                              val categorizationVersion: String = "",
                              @SerializedName("includedFeatures")
                              val includedFeatures: List<String>?,
                              @SerializedName("accessCode")
                              val accessCode: String = "",
                              @SerializedName("floorPlanLink")
                              val floorPlanLink: String? = null,
                              @SerializedName("name")
                              val name: String = "",
                              @SerializedName("features_highlights")
                              val featuresHighlights: String = "",
                              @SerializedName("thumbnailImage")
                              val thumbnailImage: String = "")