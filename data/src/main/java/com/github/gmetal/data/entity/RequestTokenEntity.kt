package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class RequestTokenEntity {

    @JsonField
    var success: Boolean = false

    @JsonField(name = ["expires_at"])
    var expiresAt: String? = null

    @JsonField(name = ["request_token"])
    var requestToken: String? = null
}
