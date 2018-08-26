package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class RequestTokenEntity {

    @JsonField
    public boolean success;

    @JsonField(name = "expires_at")
    public String expiresAt;

    @JsonField(name = "request_token")
    public String requestToken;
}
