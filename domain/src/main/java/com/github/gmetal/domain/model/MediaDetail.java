package com.github.gmetal.domain.model;

import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@Parcel
public class MediaDetail {

    public Boolean adult;
    public String backdropPath;
    public String belongsToCollection;
    public Integer budget;
    public List<String> genres = new ArrayList<>();
    public String homepage;
    public Integer id;
    public String imdbId;
    public String originalLanguage;
    public String originalTitle;
    public String overview;
    public Double popularity;
    public String posterPath;
    public String releaseDate;
    public Integer revenue;
    public Integer runtime;
    public String status;
    public String tagline;
    public String title;
    public Boolean video;
    public Float voteAverage;
    public Integer voteCount;

    public MediaDetail() {

        this.belongsToCollection = "";
        this.budget = 0;
        this.imdbId = "-1";
        this.revenue = 0;
        this.runtime = 0;
        this.tagline = "";
    }
}
