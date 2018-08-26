package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.object.Genre;
import com.github.gmetal.moviedbapi.model.object.ProductionCompany;
import com.github.gmetal.moviedbapi.model.object.ProductionCountry;
import com.github.gmetal.moviedbapi.model.object.SpokenLanguage;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class MovieResponse {

    @JsonField
    public Boolean adult;
    @JsonField(name = "backdrop_path")
    public String backdropPath;
    @JsonField(name = "belongs_to_collection")
    public String belongsToCollection;
    @JsonField
    public Integer budget;
    @JsonField
    public List<Genre> genres = new ArrayList<>();
    @JsonField
    public String homepage;
    @JsonField
    public Integer id;
    @JsonField(name = "imdb_id")
    public String imdbId;
    @JsonField(name = "original_language")
    public String originalLanguage;
    @JsonField(name = "original_title")
    public String originalTitle;
    @JsonField
    public String overview;
    @JsonField
    public Double popularity;
    @JsonField(name = "poster_path")
    public String posterPath;
    @JsonField(name = "production_companies")
    public List<ProductionCompany> productionCompanies = new ArrayList<>();
    @JsonField(name = "production_countries")
    public List<ProductionCountry> productionCountries = new ArrayList<>();
    @JsonField(name = "release_date")
    public String releaseDate;
    @JsonField
    public Integer revenue;
    @JsonField
    public Integer runtime;
    @JsonField(name = "spoken_languages")
    public List<SpokenLanguage> spokenLanguages = new ArrayList<>();
    @JsonField
    public String status;
    @JsonField
    public String tagline;
    @JsonField
    public String title;
    @JsonField
    public Boolean video;
    @JsonField(name = "vote_average")
    public Double voteAverage;
    @JsonField(name = "vote_count")
    public Integer voteCount;
}
