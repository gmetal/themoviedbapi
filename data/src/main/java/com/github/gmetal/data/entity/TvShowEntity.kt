package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class TvShowEntity {

    @SerialName("backdrop_path")
    var backdropPath: String? = null
    @SerialName("created_by")
    var createdByEntity: List<CreatedByEntity> = ArrayList()
    @SerialName("episode_run_time")
    var episodeRunTime: List<Int> = ArrayList()
    @SerialName("first_air_date")
    var firstAirDate: String? = null
    @SerialName("genreEntities")
    var genreEntities: List<GenreEntity> = ArrayList()
    @SerialName("homepage")
    var homepage: String? = null
    @SerialName("id")
    var id: Int? = null
    @SerialName("in_production")
    var inProduction: Boolean? = null
    @SerialName("languages")
    var languages: List<String> = ArrayList()
    @SerialName("last_air_date")
    var lastAirDate: String? = null
    @SerialName("name")
    var name: String? = null
    @SerialName("networkEntities")
    var networkEntities: List<NetworkEntity> = ArrayList()
    @SerialName("number_of_episodes")
    var numberOfEpisodes: Int? = null
    @SerialName("number_of_seasons")
    var numberOfSeasons: Int? = null
    @SerialName("origin_country")
    var originCountry: List<String> = ArrayList()
    @SerialName("original_language")
    var originalLanguage: String? = null
    @SerialName("original_name")
    var originalName: String? = null
    @SerialName("overview")
    var overview: String? = null
    @SerialName("popularity")
    var popularity: Double? = null
    @SerialName("poster_path")
    var posterPath: String? = null
    @SerialName("production_companies")
    var productionCompanies: List<ProductionCompanyEntity> = ArrayList()
    @SerialName("seasons")
    var seasonEntities: List<SeasonEntity> = ArrayList()
    @SerialName("status")
    var status: String? = null
    @SerialName("type")
    var type: String? = null
    @SerialName("vote_average")
    var voteAverage: Float? = null
    @SerialName("vote_count")
    var voteCount: Int? = null
}
