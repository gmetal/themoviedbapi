package com.github.gmetal.presentation.model;

import org.parceler.Parcel;

@Parcel
public class MovieModel extends MediaInfoModel {

    @Override
    public String getMediaId() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public String getImage() {
        return imageURL;
    }
}
