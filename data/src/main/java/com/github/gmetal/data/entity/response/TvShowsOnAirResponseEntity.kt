package com.github.gmetal.data.entity.response

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import com.github.gmetal.data.entity.TvShowEntity

@JsonObject
class TvShowsOnAirResponseEntity : BasePagedResponseEntity(), ResponseEntityList<TvShowEntity> {

    @JsonField(name = ["results"])
    override var resultObjects: List<TvShowEntity> = emptyList()
}
