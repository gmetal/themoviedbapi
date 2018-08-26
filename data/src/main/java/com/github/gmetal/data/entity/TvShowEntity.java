package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;
import java.util.List;

@JsonObject
public class TvShowEntity {

    @JsonField(name = "backdrop_path")
    public String backdropPath;
    @JsonField(name = "created_by")
    public List<CreatedByEntity> createdByEntity = new ArrayList<>();
    @JsonField(name = "episode_run_time")
    public List<Integer> episodeRunTime = new ArrayList<>();
    @JsonField(name = "first_air_date")
    public String firstAirDate;
    @JsonField(name = "genreEntities")
    public List<GenreEntity> genreEntities = new ArrayList<>();
    @JsonField(name = "homepage")
    public String homepage;
    @JsonField(name = "id")
    public Integer id;
    @JsonField(name = "in_production")
    public Boolean inProduction;
    @JsonField(name = "languages")
    public List<String> languages = new ArrayList<>();
    @JsonField(name = "last_air_date")
    public String lastAirDate;
    @JsonField(name = "name")
    public String name;
    @JsonField(name = "networkEntities")
    public List<NetworkEntity> networkEntities = new ArrayList<>();
    @JsonField(name = "number_of_episodes")
    public Integer numberOfEpisodes;
    @JsonField(name = "number_of_seasons")
    public Integer numberOfSeasons;
    @JsonField(name = "origin_country")
    public List<String> originCountry = new ArrayList<>();
    @JsonField(name = "original_language")
    public String originalLanguage;
    @JsonField(name = "original_name")
    public String originalName;
    @JsonField(name = "overview")
    public String overview;
    @JsonField(name = "popularity")
    public Double popularity;
    @JsonField(name = "poster_path")
    public String posterPath;
    @JsonField(name = "production_companies")
    public List<ProductionCompanyEntity> productionCompanies = new ArrayList<>();
    @JsonField(name = "seasonEntities")
    public List<SeasonEntity> seasonEntities = new ArrayList<>();
    @JsonField(name = "status")
    public String status;
    @JsonField(name = "type")
    public String type;
    @JsonField(name = "vote_average")
    public Float voteAverage;
    @JsonField(name = "vote_count")
    public Integer voteCount;
}
