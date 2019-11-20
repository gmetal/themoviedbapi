package com.github.gmetal.domain.model

import com.github.gmetal.domain.model.MediaItem.Companion.IMAGE_PREFIX

const val DEFAULT_ID = -1
fun Int?.orDefaultId(): Int = this ?: DEFAULT_ID
fun String?.imagePrefixPathOrEmpty(): String = if (this != null) IMAGE_PREFIX + this else ""

open class MediaDetail {

    var adult: Boolean? = null
    var backdropPath: String = ""
    var belongsToCollection: MediaCollection = MediaCollection.empty()
    var budget: Int? = null
    var genres: MutableList<String> = mutableListOf()
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
        this.budget = 0
        this.imdbId = "-1"
        this.revenue = 0
        this.runtime = 0
        this.tagline = ""
    }
}
