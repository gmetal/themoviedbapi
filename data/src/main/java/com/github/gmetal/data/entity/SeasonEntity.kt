package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class SeasonEntity {

    @SerialName("air_date")
    var airDate: String? = null

    @SerialName("episode_count")
    var episodeCount: Int? = null

    @SerialName("id")
    var id: Int? = null

    @SerialName("poster_path")
    var posterPath: String? = null

    @SerialName("season_number")
    var seasonNumber: Int? = null
}
