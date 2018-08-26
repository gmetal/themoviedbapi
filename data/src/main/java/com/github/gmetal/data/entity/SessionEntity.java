package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class SessionEntity extends BaseMoviesDbEntity {

    @JsonField
    public boolean success;

    @JsonField(name = "session_id")
    public String sessionId;
}
