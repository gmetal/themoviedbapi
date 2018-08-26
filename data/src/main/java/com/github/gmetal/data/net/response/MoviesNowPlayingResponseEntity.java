package com.github.gmetal.data.net.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.data.entity.MovieEntity;

import java.util.List;

@JsonObject
public class MoviesNowPlayingResponseEntity extends BasePagedResponseEntity<MovieEntity> {

    @JsonField(name = "results")
    public List<MovieEntity> mResults;

    @Override
    public List<MovieEntity> getResultObjects() {

        return mResults;
    }
}
