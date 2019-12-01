package com.github.gmetal.domain.model

import com.github.gmetal.domain.model.MediaItem.Companion.IMAGE_PREFIX

class TvSeason {

    var id: Int? = null
    var airDate: String
    var episodeCount: Int? = null
    var seasonNumber: Int? = null
    var posterPath: String

    val mediaId: String
        get() = id.toString()

    val image: String
        get() = IMAGE_PREFIX + posterPath

    val title: String
        get() = "SeasonEntity ${seasonNumber}"

    init {

        this.id = 0
        this.airDate = ""
        this.episodeCount = 0
        this.seasonNumber = 0
        this.posterPath = ""
    }
}
