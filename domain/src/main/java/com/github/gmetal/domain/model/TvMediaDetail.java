package com.github.gmetal.domain.model;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class TvMediaDetail extends MediaDetail {

    List<TvSeason> seasons;

    public TvMediaDetail() {

        super();
        seasons = new ArrayList<>();
    }

    public List<TvSeason> getSeasons() {

        return seasons;
    }

    public void setSeasons(List<TvSeason> seasons) {

        this.seasons = seasons;
    }
}
