package com.github.gmetal.domain.model;

import java.util.Objects;

public class MediaInfo {

    protected String name;
    protected boolean isTv;

    protected String dbId;

    protected String imageURL;
    protected String overview;
    protected Integer voteCount;
    protected Float voteAverage;

    public MediaInfo() {

        super();
    }
    
    public String getMediaId() {

        return this.getDbId();
    }

    public String getImage() {

        return getImageURL();
    }

    public String getTitle() {

        return getName();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isTv() {

        return isTv;
    }

    public void setTv(boolean tv) {

        isTv = tv;
    }

    public String getDbId() {

        return dbId;
    }

    public void setDbId(String dbId) {

        this.dbId = dbId;
    }

    public String getImageURL() {

        return imageURL;
    }

    public void setImageURL(String imageURL) {

        this.imageURL = imageURL;
    }

    public String getOverview() {

        return overview;
    }

    public void setOverview(String overview) {

        this.overview = overview;
    }

    public Integer getVoteCount() {

        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {

        this.voteCount = voteCount;
    }

    public Float getVoteAverage() {

        return voteAverage;
    }

    public void setVoteAverage(Float voteAverage) {

        this.voteAverage = voteAverage;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaInfo mediaInfo = (MediaInfo) o;
        return isTv() == mediaInfo.isTv()
                && Objects.equals(getName(), mediaInfo.getName())
                && Objects.equals(getDbId(), mediaInfo.getDbId())
                && Objects.equals(getImageURL(), mediaInfo.getImageURL())
                && Objects.equals(getOverview(), mediaInfo.getOverview())
                && Objects.equals(getVoteCount(), mediaInfo.getVoteCount())
                && Objects.equals(getVoteAverage(), mediaInfo.getVoteAverage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), isTv(), getDbId(), getImageURL(), getOverview(), getVoteCount(), getVoteAverage());
    }
}
