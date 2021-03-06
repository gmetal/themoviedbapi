package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CreatedByEntity {

    @SerialName("id")
    var id: Int? = null
    @SerialName("name")
    var name: String? = null
    @SerialName("profile_path")
    var profilePath: String? = null
}
