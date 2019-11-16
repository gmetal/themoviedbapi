package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class GravatarEntity {

    @SerialName("hash")
    var hash: String? = null
}
