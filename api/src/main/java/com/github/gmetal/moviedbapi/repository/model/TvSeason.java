package com.github.gmetal.moviedbapi.repository.model;

import com.github.gmetal.moviedbapi.model.object.Season;
import org.parceler.Parcel;

@Parcel
public class TvSeason extends MediaInfoDataObject {

    Integer id;
    String airDate;
    Integer episodeCount;
    Integer seasonNumber;
    String posterPath;

    public TvSeason() {

        this.id = 0;
        this.airDate = "";
        this.episodeCount = 0;
        this.seasonNumber = 0;
        this.posterPath = "";
    }

    public TvSeason(Season season) {

        this.id = season.id;
        this.airDate = season.airDate;
        this.episodeCount = season.episodeCount;
        this.posterPath = season.posterPath;
        this.seasonNumber = season.seasonNumber;
    }

    public void setId(final Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return this.id;
    }

    @Override
    public String getMediaId() {

        return Integer.toString(this.id);
    }

    @Override
    public String getImage() {

        return IMAGE_PREFIX + posterPath;
    }

    @Override
    public String getTitle() {

        return "Season " + seasonNumber;
    }

    public static TvSeason getLoadingObject() {

        TvSeason season = new TvSeason();
        season.setIsLoadingObject(true);
        return season;
    }

    public String getAirDate() {

        return airDate;
    }

    public void setAirDate(String airDate) {

        this.airDate = airDate;
    }

    public Integer getEpisodeCount() {

        return episodeCount;
    }

    public void setEpisodeCount(Integer episodeCount) {

        this.episodeCount = episodeCount;
    }
}
