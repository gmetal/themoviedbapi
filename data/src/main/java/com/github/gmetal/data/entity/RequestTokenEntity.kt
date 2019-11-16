package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class RequestTokenEntity {

    var success: Boolean = false

    @SerialName("expires_at")
    var expiresAt: String? = null

    @SerialName("request_token")
    var requestToken: String? = null
}
