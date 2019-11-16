package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class GuestSessionEntity : BaseMoviesDbEntity() {

    var success: Boolean = false

    @SerialName("guest_session_id")
    var guestSessionId: String? = null

    @SerialName("expires_at")
    var expiresAt: String? = null
}

