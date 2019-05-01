package com.github.gmetal.presentation.model;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class TvShowModel extends MediaInfoModel {

    protected List<TvShowSeasonModel> seasons;

    public TvShowModel() {

        super();
        seasons = new ArrayList<>();
    }

    @Override
    public String getMediaId() {
        return getId();
    }

    @Override
    public String getImage() {
        return imageURL;
    }

    @Override
    public String getTitle() {
        return name;
    }

    public List<TvShowSeasonModel> getSeasons() {
        return seasons;
    }

    public void setSeasons(final List<TvShowSeasonModel> seasons) {

        this.seasons = seasons;
    }
}
