package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class ProductionCompanyEntity {

    @JsonField
    var name: String? = null
    @JsonField
    var id: Int? = null
}
