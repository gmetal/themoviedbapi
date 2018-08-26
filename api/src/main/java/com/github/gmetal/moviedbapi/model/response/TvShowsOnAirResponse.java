package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.object.TvShow;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class TvShowsOnAirResponse extends BasePagedResponse<TvShow> {

    @JsonField(name = "results")
    public List<TvShow> mResults;

    @Override
    public List<TvShow> getResultObjects() {

        return mResults;
    }
}
