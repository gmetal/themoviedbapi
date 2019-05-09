package com.github.gmetal.presentation.model;

import com.github.gmetal.domain.model.MediaItem;


public abstract class MediaInfoModel extends BaseDataModel implements MediaItem {

    protected String overview;
    protected Integer voteCount;
    protected Float voteAverage;
    protected String id;
    protected String name;
    protected String imageURL;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setImageURL(final String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(final String overview) {
        this.overview = overview;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(final Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(final Float voteAverage) {
        this.voteAverage = voteAverage;
    }
}
