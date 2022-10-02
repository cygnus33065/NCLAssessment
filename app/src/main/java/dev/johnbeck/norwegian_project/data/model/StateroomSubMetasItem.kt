package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class StateroomSubMetasItem(@SerializedName("featuredTag")
                                 val featuredTag: String? = null,
                                 @SerializedName("code")
                                 val code: String = "",
                                 @SerializedName("view360Link")
                                 val viewLink: String? = null,
                                 @SerializedName("occupancy")
                                 val occupancy: String = "",
                                 @SerializedName("description")
                                 val description: String = "",
                                 @SerializedName("balconySize")
                                 val balconySize: String = "",
                                 @SerializedName("body")
                                 val body: String = "",
                                 @SerializedName("imageLinks")
                                 val imageLinks: List<ImageLinksItem>?,
                                 @SerializedName("featuredTagDescription")
                                 val featuredTagDescription: String? = null,
                                 @SerializedName("guaranteeMessage")
                                 val guaranteeMessage: String = "",
                                 @SerializedName("approximateSize")
                                 val approximateSize: String = "",
                                 @SerializedName("featuresAndHighlights")
                                 val featuresAndHighlights: String = "",
                                 @SerializedName("marketingTagLine")
                                 val marketingTagLine: String = "",
                                 @SerializedName("stateroomCategories")
                                 val stateroomCategories: List<StateroomCategoriesItem>?,
                                 @SerializedName("accessCode")
                                 val accessCode: String = "",
                                 @SerializedName("floorPlanLink")
                                 val floorPlanLink: String = "",
                                 @SerializedName("name")
                                 val name: String = "",
                                 @SerializedName("thumbnailImage")
                                 val thumbnailImage: String = "")