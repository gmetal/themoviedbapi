package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.object.Movie;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class MoviesNowPlayingResponse extends BasePagedResponse<Movie> {

    @JsonField(name = "results")
    public List<Movie> mResults;

    @Override
    public List<Movie> getResultObjects() {

        return mResults;
    }
}
