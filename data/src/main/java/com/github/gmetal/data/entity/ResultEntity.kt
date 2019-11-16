package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class ResultEntity {
    @SerialName("poster_path")
    var posterPath: String = ""
    var adult: Boolean? = null
    var overview: String = ""
    @SerialName("release_date")
    var releaseDate: String? = null
        get() = if (field == null) firstAirDate else field
    @SerialName("first_air_date")
    var firstAirDate: String? = null
    var genreIds: List<Int> = ArrayList()
    var id: Int? = null
    @SerialName("original_title")
    var originalTitle: String = ""
    @SerialName("original_language")
    var originalLanguage: String = ""
    var title: String? = null
        get() = if (field == null) name else field
    var name: String? = null
    @SerialName("original_name")
    var originalName: String? = null
    @SerialName("backdrop_path")
    var backdropPath: String = ""
    var popularity: Float? = null
    @SerialName("vote_count")
    var voteCount: Int? = null
    var video: Boolean? = null
    @SerialName("vote_average")
    var voteAverage: Float? = null
}
