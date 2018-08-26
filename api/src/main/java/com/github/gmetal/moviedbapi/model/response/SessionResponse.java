package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.response.BaseMoviesDbResponse;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class SessionResponse extends BaseMoviesDbResponse {

    @JsonField
    public boolean success;

    @JsonField(name = "session_id")
    public String sessionId;
}
