package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import java.util.*

@JsonObject
class ResultEntity {
    @JsonField(name = ["poster_path"])
    var posterPath: String = ""
    @JsonField
    var adult: Boolean? = null
    @JsonField
    var overview: String = ""
    @JsonField(name = ["release_date"])
    var releaseDate: String? = null
        get() = if (field == null) firstAirDate else field

    @JsonField(name = ["first_air_date"])
    var firstAirDate: String? = null
    @JsonField
    var genreIds: List<Int> = ArrayList()
    @JsonField
    var id: Int? = null
    @JsonField(name = ["original_title"])
    var originalTitle: String = ""
    @JsonField(name = ["original_language"])
    var originalLanguage: String = ""
    @JsonField
    var title: String? = null
        get() = if (field == null) name else field
    @JsonField
    var name: String? = null
    @JsonField(name = ["original_name"])
    var originalName: String? = null
    @JsonField(name = ["backdrop_path"])
    var backdropPath: String = ""
    @JsonField
    var popularity: Float? = null
    @JsonField(name = ["vote_count"])
    var voteCount: Int? = null
    @JsonField
    var video: Boolean? = null
    @JsonField(name = ["vote_average"])
    var voteAverage: Float? = null
}
