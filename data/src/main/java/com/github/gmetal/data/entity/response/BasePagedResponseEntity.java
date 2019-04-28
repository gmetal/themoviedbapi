package com.github.gmetal.data.entity.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.data.entity.BaseMoviesDbEntity;

import java.util.List;

@JsonObject
public class BasePagedResponseEntity<T> extends BaseMoviesDbEntity<T> {

    @JsonField(name = "page")
    public int mPage;

    @JsonField(name = "total_results")
    public int mTotalResults;

    @JsonField(name = "total_pages")
    public int mTotalPages;

    public List<T> getResultObjects() {

        return null;
    }
}
