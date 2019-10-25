package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class NetworkEntity {

    @JsonField(name = ["id"])
    var id: Int? = null
    @JsonField(name = ["name"])
    var name: String? = null
}
