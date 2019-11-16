package com.github.gmetal.data.entity.response

import com.github.gmetal.data.entity.BaseMoviesDbEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class BasePagedResponseEntity : BaseMoviesDbEntity() {

    @SerialName("page")
    var page: Int = 0

    @SerialName("total_results")
    var totalResults: Int = 0

    @SerialName("total_pages")
    var totalPages: Int = 0
}
