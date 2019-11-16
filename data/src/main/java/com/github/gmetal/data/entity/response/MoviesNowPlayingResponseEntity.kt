package com.github.gmetal.data.entity.response

import com.github.gmetal.data.entity.MovieEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class MoviesNowPlayingResponseEntity : BasePagedResponseEntity(), ResponseEntityList<MovieEntity> {

    @SerialName("results")
    override var resultObjects: List<MovieEntity> = emptyList()
}
