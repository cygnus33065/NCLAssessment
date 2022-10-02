package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class ImageLinksItem(@SerializedName("imageLink")
                          val imageLink: String = "",
                          @SerializedName("imageHeadLine")
                          val imageHeadLine: String = "",
                          @SerializedName("legendWeight")
                          val legendWeight: String = "")