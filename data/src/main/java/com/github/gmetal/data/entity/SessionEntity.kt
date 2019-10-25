package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class SessionEntity : BaseMoviesDbEntity() {

    @JsonField
    var success: Boolean = false

    @JsonField(name = ["session_id"])
    var sessionId: String? = null
}
