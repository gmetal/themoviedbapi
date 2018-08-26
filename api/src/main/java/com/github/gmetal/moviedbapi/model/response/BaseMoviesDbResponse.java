package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import org.parceler.Parcel;

@Parcel
@JsonObject
public class BaseMoviesDbResponse<T> {
    // This is parameterised so that we can get the code to compile :)

    @JsonField(name = "status_message")
    public String statusMessage;

    @JsonField(name = "status_code")
    public int statusCode;
}
