package com.github.gmetal.data.entity.response

import com.github.gmetal.data.entity.TvShowEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class TvShowsOnAirResponseEntity : BasePagedResponseEntity(), ResponseEntityList<TvShowEntity> {

    @SerialName("results")
    override var resultObjects: List<TvShowEntity> = emptyList()
}
