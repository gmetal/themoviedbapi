package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class CreatedByEntity {

    @JsonField(name = "id")
    public Integer id;
    @JsonField(name = "name")
    public String name;
    @JsonField(name = "profile_path")
    public String profilePath;
}
