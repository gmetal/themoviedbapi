package com.github.gmetal.moviedbapi.repository.model;

import com.github.gmetal.moviedbapi.repository.model.LoadingObject;

public class BaseDataObject implements LoadingObject {

    protected boolean isLoadingObject;

    public BaseDataObject() {

        this(false);
    }

    public BaseDataObject(boolean isLoadingObject) {

        this.isLoadingObject = isLoadingObject;
    }

    public boolean isLoadingObject() {

        return this.isLoadingObject;
    }

    public void setIsLoadingObject(boolean isLoadingObject) {

        this.isLoadingObject = isLoadingObject;
    }
}
