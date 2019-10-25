package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class SpokenLanguageEntity {

    @JsonField
    var iso6391: String? = null
    @JsonField
    var name: String? = null
}
