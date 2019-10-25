package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class MovieDatesEntity {

    @JsonField(name = ["minimum"])
    var mMinimum: String? = null

    @JsonField(name = ["maximum"])
    var mMaximum: String? = null
}
