package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class SpokenLanguageEntity {

    @JsonField
    public String iso6391;
    @JsonField
    public String name;
}
