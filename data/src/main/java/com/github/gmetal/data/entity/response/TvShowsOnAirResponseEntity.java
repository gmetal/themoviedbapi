package com.github.gmetal.data.entity.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.data.entity.TvShowEntity;

import java.util.List;

@JsonObject
public class TvShowsOnAirResponseEntity extends BasePagedResponseEntity<TvShowEntity> {

    @JsonField(name = "results")
    public List<TvShowEntity> mResults;

    @Override
    public List<TvShowEntity> getResultObjects() {

        return mResults;
    }
}
