package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class MovieEntity {

    var adult: Boolean? = null

    @SerialName("backdrop_path")
    var backdropPath: String? = null

    @SerialName("belongs_to_collection")
    var belongsToCollection: CollectionEntity? = null

    var budget: Int? = null

    var genreEntities: List<GenreEntity> = ArrayList()

    var homepage: String? = null

    var id: Int? = null

    @SerialName("imdb_id")
    var imdbId: String? = null

    @SerialName("original_language")
    var originalLanguage: String? = null

    @SerialName("original_title")
    var originalTitle: String? = null

    var overview: String? = null

    var popularity: Double? = null

    @SerialName("poster_path")
    var posterPath: String? = null

    @SerialName("production_companies")
    var productionCompanies: List<ProductionCompanyEntity> = ArrayList()

    @SerialName("production_countries")
    var productionCountries: List<ProductionCountryEntity> = ArrayList()

    @SerialName("release_date")
    var releaseDate: String? = null

    var revenue: Int? = null

    var runtime: Int? = null

    @SerialName("spoken_languages")
    var spokenLanguageEntities: List<SpokenLanguageEntity> = ArrayList()

    var status: String? = null

    var tagline: String? = null

    var title: String? = null

    var video: Boolean? = null

    @SerialName("vote_average")
    var voteAverage: Float? = null

    @SerialName("vote_count")
    var voteCount: Int? = null
}
