package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

import java.util.ArrayList

@JsonObject
class SearchEntity : BaseMoviesDbEntity() {

    @JsonField
    var page: Int? = null
    @JsonField
    var resultEntities: List<ResultEntity> = ArrayList()
    @JsonField
    var totalResults: Int? = null
    @JsonField
    var totalPages: Int? = null
}
