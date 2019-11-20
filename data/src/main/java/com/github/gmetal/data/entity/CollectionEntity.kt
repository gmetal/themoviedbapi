package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CollectionEntity(

    var id: Int? = null,
    var name: String? = null,
    @SerialName("poster_path")
    var posterPath: String? = null,
    @SerialName("backdrop_path")
    var backdropPath: String? = null
)