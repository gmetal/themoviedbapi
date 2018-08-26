package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import org.parceler.Parcel;

@Parcel
@JsonObject
public class RequestToken {

    @JsonField
    public boolean success;

    @JsonField(name = "expires_at")
    public String expiresAt;

    @JsonField(name = "request_token")
    public String requestToken;
}
