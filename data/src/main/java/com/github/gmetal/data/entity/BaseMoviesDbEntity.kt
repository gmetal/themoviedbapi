package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
open class BaseMoviesDbEntity {
    @SerialName("status_message")
    var statusMessage: String? = null

    @SerialName("status_code")
    var statusCode: Int = 0
}
