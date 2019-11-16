package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class NetworkEntity {

    @SerialName("id")
    var id: Int? = null
    @SerialName("name")
    var name: String? = null
}
