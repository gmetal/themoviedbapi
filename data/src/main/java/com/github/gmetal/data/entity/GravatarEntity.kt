package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class GravatarEntity {

    @JsonField(name = ["hash"])
    var hash: String? = null
}
