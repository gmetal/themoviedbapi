package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

import java.util.ArrayList

@JsonObject
class TvShowEntity {

    @JsonField(name = ["backdrop_path"])
    var backdropPath: String? = null
    @JsonField(name = ["created_by"])
    var createdByEntity: List<CreatedByEntity> = ArrayList()
    @JsonField(name = ["episode_run_time"])
    var episodeRunTime: List<Int> = ArrayList()
    @JsonField(name = ["first_air_date"])
    var firstAirDate: String? = null
    @JsonField(name = ["genreEntities"])
    var genreEntities: List<GenreEntity> = ArrayList()
    @JsonField(name = ["homepage"])
    var homepage: String? = null
    @JsonField(name = ["id"])
    var id: Int? = null
    @JsonField(name = ["in_production"])
    var inProduction: Boolean? = null
    @JsonField(name = ["languages"])
    var languages: List<String> = ArrayList()
    @JsonField(name = ["last_air_date"])
    var lastAirDate: String? = null
    @JsonField(name = ["name"])
    var name: String? = null
    @JsonField(name = ["networkEntities"])
    var networkEntities: List<NetworkEntity> = ArrayList()
    @JsonField(name = ["number_of_episodes"])
    var numberOfEpisodes: Int? = null
    @JsonField(name = ["number_of_seasons"])
    var numberOfSeasons: Int? = null
    @JsonField(name = ["origin_country"])
    var originCountry: List<String> = ArrayList()
    @JsonField(name = ["original_language"])
    var originalLanguage: String? = null
    @JsonField(name = ["original_name"])
    var originalName: String? = null
    @JsonField(name = ["overview"])
    var overview: String? = null
    @JsonField(name = ["popularity"])
    var popularity: Double? = null
    @JsonField(name = ["poster_path"])
    var posterPath: String? = null
    @JsonField(name = ["production_companies"])
    var productionCompanies: List<ProductionCompanyEntity> = ArrayList()
    @JsonField(name = ["seasonEntities"])
    var seasonEntities: List<SeasonEntity> = ArrayList()
    @JsonField(name = ["status"])
    var status: String? = null
    @JsonField(name = ["type"])
    var type: String? = null
    @JsonField(name = ["vote_average"])
    var voteAverage: Float? = null
    @JsonField(name = ["vote_count"])
    var voteCount: Int? = null
}
