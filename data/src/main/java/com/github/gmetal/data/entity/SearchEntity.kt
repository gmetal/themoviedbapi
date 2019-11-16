package com.github.gmetal.data.entity

import kotlinx.serialization.Serializable

@Serializable
class SearchEntity : BaseMoviesDbEntity() {

    var page: Int? = null
    var resultEntities: List<ResultEntity> = ArrayList()
    var totalResults: Int? = null
    var totalPages: Int? = null
}
