package com.github.gmetal.presentation.model;

import org.parceler.Parcel;

@Parcel
public class BaseDataModel implements LoadingModel {

    protected boolean isLoadingObject;

    public BaseDataModel() {

        this(false);
    }

    public BaseDataModel(boolean isLoadingObject) {

        this.isLoadingObject = isLoadingObject;
    }

    public boolean isLoadingObject() {

        return this.isLoadingObject;
    }

    public void setIsLoadingObject(boolean isLoadingObject) {

        this.isLoadingObject = isLoadingObject;
    }
}
