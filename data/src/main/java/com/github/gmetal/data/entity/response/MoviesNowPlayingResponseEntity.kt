package com.github.gmetal.data.entity.response

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import com.github.gmetal.data.entity.MovieEntity

@JsonObject
class MoviesNowPlayingResponseEntity : BasePagedResponseEntity(), ResponseEntityList<MovieEntity> {

    @JsonField(name = ["results"])
    override var resultObjects: List<MovieEntity> = emptyList()
}
