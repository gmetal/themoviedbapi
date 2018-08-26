package com.github.gmetal.moviedbapi.repository.model;

import com.github.gmetal.moviedbapi.model.response.MovieResponse;
import org.parceler.Parcel;

@Parcel
public class MovieMediaDetail extends MediaDetail {

    public MovieMediaDetail() {

        super();
    }

    public MovieMediaDetail(MovieResponse response) {

        super();

        this.adult = response.adult;
        this.backdropPath = MediaItem.IMAGE_PREFIX + response.backdropPath;
        this.belongsToCollection = response.belongsToCollection;
        this.budget = response.budget;
        for (int i = 0; i < response.genres.size(); i++) {
            this.genres.add(response.genres.get(i).name);
        }
        this.homepage = response.homepage;
        this.id = response.id;
        this.imdbId = response.imdbId;
        this.originalLanguage = response.originalLanguage;
        this.originalTitle = response.originalTitle;
        this.overview = response.overview;
        this.popularity = response.popularity;
        this.posterPath = MediaItem.IMAGE_PREFIX + response.posterPath;
        this.releaseDate = response.releaseDate;
        this.revenue = response.revenue;
        this.runtime = response.runtime;
        this.status = response.status;
        this.tagline = response.tagline;
        this.title = response.title;
        this.video = response.video;
        this.voteAverage = response.voteAverage;
        this.voteCount = response.voteCount;
    }
}
