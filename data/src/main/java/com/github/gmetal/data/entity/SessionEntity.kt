package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class SessionEntity : BaseMoviesDbEntity() {

    var success: Boolean = false

    @SerialName("session_id")
    var sessionId: String? = null
}
