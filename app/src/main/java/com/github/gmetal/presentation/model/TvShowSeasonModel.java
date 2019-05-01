package com.github.gmetal.presentation.model;

import org.parceler.Parcel;

@Parcel
public class TvShowSeasonModel {

    protected int id;
    protected String airDate;
    protected Integer episodeCount;
    protected Integer seasonNumber;
    protected String posterPath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}
