package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class GenreEntity {

    @JsonField
    var id: Int? = null
    @JsonField
    var name: String? = null
}
