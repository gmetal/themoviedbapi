package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class GuestSessionEntity extends BaseMoviesDbEntity {

    @JsonField
    public boolean success;

    @JsonField(name = "guest_session_id")
    public String guestSessionId;

    @JsonField(name = "expires_at")
    public String expiresAt;
}

