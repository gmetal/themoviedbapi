package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class GenreEntity {

    @JsonField
    public Integer id;
    @JsonField
    public String name;
}
