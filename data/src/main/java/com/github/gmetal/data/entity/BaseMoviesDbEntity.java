package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class BaseMoviesDbEntity<T> {
    // This is parameterised so that we can get the code to compile :)

    @JsonField(name = "status_message")
    public String statusMessage;

    @JsonField(name = "status_code")
    public int statusCode;
}
