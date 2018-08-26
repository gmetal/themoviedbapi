package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.object.CreatedBy;
import com.github.gmetal.moviedbapi.model.object.Genre;
import com.github.gmetal.moviedbapi.model.object.Network;
import com.github.gmetal.moviedbapi.model.object.ProductionCompany;
import com.github.gmetal.moviedbapi.model.object.Season;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class TvResponse {

    @JsonField(name = "backdrop_path")
    public String backdropPath;
    @JsonField(name = "created_by")
    public List<CreatedBy> createdBy = new ArrayList<>();
    @JsonField(name = "episode_run_time")
    public List<Integer> episodeRunTime = new ArrayList<>();
    @JsonField(name = "first_air_date")
    public String firstAirDate;
    @JsonField(name = "genres")
    public List<Genre> genres = new ArrayList<>();
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
    @JsonField(name = "networks")
    public List<Network> networks = new ArrayList<>();
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
    public List<ProductionCompany> productionCompanies = new ArrayList<>();
    @JsonField(name = "seasons")
    public List<Season> seasons = new ArrayList<>();
    @JsonField(name = "status")
    public String status;
    @JsonField(name = "type")
    public String type;
    @JsonField(name = "vote_average")
    public Double voteAverage;
    @JsonField(name = "vote_count")
    public Integer voteCount;
}
