package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

import java.util.ArrayList

@JsonObject
class MovieEntity {

    @JsonField
    var adult: Boolean? = null

    @JsonField(name = ["backdrop_path"])
    var backdropPath: String? = null

    @JsonField(name = ["belongs_to_collection"])
    var belongsToCollection: String? = null

    @JsonField
    var budget: Int? = null

    @JsonField
    var genreEntities: List<GenreEntity> = ArrayList()

    @JsonField
    var homepage: String? = null

    @JsonField
    var id: Int? = null

    @JsonField(name = ["imdb_id"])
    var imdbId: String? = null

    @JsonField(name = ["original_language"])
    var originalLanguage: String? = null

    @JsonField(name = ["original_title"])
    var originalTitle: String? = null

    @JsonField
    var overview: String? = null

    @JsonField
    var popularity: Double? = null

    @JsonField(name = ["poster_path"])
    var posterPath: String? = null

    @JsonField(name = ["production_companies"])
    var productionCompanies: List<ProductionCompanyEntity> = ArrayList()

    @JsonField(name = ["production_countries"])
    var productionCountries: List<ProductionCountryEntity> = ArrayList()

    @JsonField(name = ["release_date"])
    var releaseDate: String? = null

    @JsonField
    var revenue: Int? = null

    @JsonField
    var runtime: Int? = null

    @JsonField(name = ["spoken_languages"])
    var spokenLanguageEntities: List<SpokenLanguageEntity> = ArrayList()

    @JsonField
    var status: String? = null

    @JsonField
    var tagline: String? = null

    @JsonField
    var title: String? = null

    @JsonField
    var video: Boolean? = null

    @JsonField(name = ["vote_average"])
    var voteAverage: Float? = null

    @JsonField(name = ["vote_count"])
    var voteCount: Int? = null
}
