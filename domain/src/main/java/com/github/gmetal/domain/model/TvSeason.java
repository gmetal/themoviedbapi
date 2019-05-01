package com.github.gmetal.domain.model;

import static com.github.gmetal.domain.model.MediaItem.IMAGE_PREFIX;

public class TvSeason {

    protected Integer id;
    protected String airDate;
    protected Integer episodeCount;
    protected Integer seasonNumber;
    protected String posterPath;

    public TvSeason() {

        this.setId(0);
        this.setAirDate("");
        this.setEpisodeCount(0);
        this.setSeasonNumber(0);
        this.setPosterPath("");
    }

    public void setId(final Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return this.id;
    }

    public String getMediaId() {

        return Integer.toString(this.getId());
    }

    public String getImage() {

        return IMAGE_PREFIX + getPosterPath();
    }

    public String getTitle() {

        return "SeasonEntity " + getSeasonNumber();
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

    public String getPosterPath() {
        return posterPath;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}
