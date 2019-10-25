package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class SeasonEntity {

    @JsonField(name = ["air_date"])
    var airDate: String? = null

    @JsonField(name = ["episode_count"])
    var episodeCount: Int? = null

    @JsonField(name = ["id"])
    var id: Int? = null

    @JsonField(name = ["poster_path"])
    var posterPath: String? = null

    @JsonField(name = ["season_number"])
    var seasonNumber: Int? = null
}
