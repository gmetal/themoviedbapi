package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
open class BaseMoviesDbEntity {
    @JsonField(name = ["status_message"])
    var statusMessage: String? = null

    @JsonField(name = ["status_code"])
    var statusCode: Int = 0
}
