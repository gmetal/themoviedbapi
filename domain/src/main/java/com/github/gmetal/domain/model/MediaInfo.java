package com.github.gmetal.domain.model;

import org.parceler.Parcel;

import java.util.Objects;

@Parcel
public class MediaInfo extends MediaInfoDataObject {

    String name;
    boolean isTv;

    String dbId;

    String imageURL;
    String overview;
    Integer voteCount;
    Float voteAverage;

    public MediaInfo() {

        super();
    }

    public static MediaInfo getLoadingMediaInfo() {

        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.setIsLoadingObject(true);
        return mediaInfo;
    }

    @Override
    public String getMediaId() {

        return this.getDbId();
    }

    @Override
    public String getImage() {

        return getImageURL();
    }

    @Override
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
        return isTv == mediaInfo.isTv
                && Objects.equals(name, mediaInfo.name)
                && Objects.equals(dbId, mediaInfo.dbId)
                && Objects.equals(imageURL, mediaInfo.imageURL)
                && Objects.equals(overview, mediaInfo.overview)
                && Objects.equals(voteCount, mediaInfo.voteCount)
                && Objects.equals(voteAverage, mediaInfo.voteAverage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, isTv, dbId, imageURL, overview, voteCount, voteAverage);
    }
}
