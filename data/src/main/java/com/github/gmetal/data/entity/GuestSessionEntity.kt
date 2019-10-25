package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class GuestSessionEntity : BaseMoviesDbEntity() {

    @JsonField
    var success: Boolean = false

    @JsonField(name = ["guest_session_id"])
    var guestSessionId: String? = null

    @JsonField(name = ["expires_at"])
    var expiresAt: String? = null
}

