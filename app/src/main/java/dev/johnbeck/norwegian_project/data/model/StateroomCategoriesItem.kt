package dev.johnbeck.norwegian_project.data.model

import com.google.gson.annotations.SerializedName

data class StateroomCategoriesItem(@SerializedName("colorSwatch")
                                   val colorSwatch: String = "",
                                   @SerializedName("code")
                                   val code: String = "",
                                   @SerializedName("mandatoryCabin")
                                   val mandatoryCabin: Boolean = false,
                                   @SerializedName("name")
                                   val name: String = "",
                                   @SerializedName("positionInShip")
                                   val positionInShip: String = "",
                                   @SerializedName("description")
                                   val description: String? = null,
                                   @SerializedName("comment")
                                   val comment: String = "",
                                   @SerializedName("decks")
                                   val decks: String = "",
                                   @SerializedName("upsellStateroomCategory")
                                   val upsellStateroomCategory: String? = null,
                                   @SerializedName("categoryID")
                                   val categoryID: String = "")