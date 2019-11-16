package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class MovieDatesEntity {

    @SerialName("minimum")
    var mMinimum: String? = null

    @SerialName("maximum")
    var mMaximum: String? = null
}
