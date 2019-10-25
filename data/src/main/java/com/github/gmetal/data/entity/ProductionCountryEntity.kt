package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class ProductionCountryEntity {

    @JsonField
    var iso31661: String? = null
    @JsonField
    var name: String? = null
}
