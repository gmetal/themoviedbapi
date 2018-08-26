package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class BasePagedResponse<T> extends BaseMoviesDbResponse<T> {

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
