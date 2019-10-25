package com.github.gmetal.domain.model

import java.util.*

open class MediaDetail {

    var adult: Boolean? = null
    var backdropPath: String = ""
    var belongsToCollection: String
    var budget: Int? = null
    var genres: MutableList<String> = ArrayList()
    var homepage: String = ""
    var id: Int? = null
    var imdbId: String
    var originalLanguage: String = ""
    var originalTitle: String = ""
    var overview: String = ""
    var popularity: Double? = null
    var posterPath: String = ""
    var releaseDate: String = ""
    var revenue: Int? = null
    var runtime: Int? = null
    var status: String = ""
    var tagline: String
    var title: String = ""
    var video: Boolean? = null
    var voteAverage: Float? = null
    var voteCount: Int? = null

    init {

        this.belongsToCollection = ""
        this.budget = 0
        this.imdbId = "-1"
        this.revenue = 0
        this.runtime = 0
        this.tagline = ""
    }
}
