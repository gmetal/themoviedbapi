package com.github.gmetal.moviedbapi.repository.model;

import com.github.gmetal.moviedbapi.model.response.TvResponse;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@Parcel
public class TvMediaDetail extends MediaDetail {

    List<TvSeason> seasons;

    public TvMediaDetail() {

        super();
    }

    public TvMediaDetail(TvResponse response) {

        super();

        this.adult = false;
        this.backdropPath = MediaItem.IMAGE_PREFIX + response.backdropPath;
        for (int i = 0; i < response.genres.size(); i++) {
            this.genres.add(response.genres.get(i).name);
        }
        this.homepage = response.homepage;
        this.id = response.id;
        this.originalLanguage = response.originalLanguage;
        this.originalTitle = response.originalName;
        this.overview = response.overview;
        this.popularity = response.popularity;
        this.posterPath = MediaItem.IMAGE_PREFIX + response.posterPath;
        this.releaseDate = response.firstAirDate;
        this.status = response.status;
        this.title = response.name;
        this.video = true;
        this.voteAverage = response.voteAverage;
        this.voteCount = response.voteCount;
        this.seasons = new ArrayList<>();

        for (int i = 0; i < response.seasons.size(); i++) {
            this.seasons.add(new TvSeason(response.seasons.get(i)));
        }
    }

    public List<TvSeason> getSeasons() {

        return seasons;
    }
    public void setSeasons(List<TvSeason> seasons) {

        this.seasons = seasons;
    }
}
