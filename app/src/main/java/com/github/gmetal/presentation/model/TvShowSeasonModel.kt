package com.github.gmetal.presentation.model

import org.parceler.Parcel

@Parcel
class TvShowSeasonModel {

    var id: Int = 0
    var airDate: String = ""
    var episodeCount: Int? = null
    var seasonNumber: Int? = null
    var posterPath: String = ""
}
