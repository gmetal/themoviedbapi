package com.github.gmetal.data.entity.response

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import com.github.gmetal.data.entity.BaseMoviesDbEntity

@JsonObject
open class BasePagedResponseEntity : BaseMoviesDbEntity() {

    @JsonField(name = ["page"])
    var page: Int = 0

    @JsonField(name = ["total_results"])
    var totalResults: Int = 0

    @JsonField(name = ["total_pages"])
    var totalPages: Int = 0
}
