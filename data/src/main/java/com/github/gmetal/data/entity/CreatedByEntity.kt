package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class CreatedByEntity {

    @JsonField(name = ["id"])
    var id: Int? = null
    @JsonField(name = ["name"])
    var name: String? = null
    @JsonField(name = ["profile_path"])
    var profilePath: String? = null
}
