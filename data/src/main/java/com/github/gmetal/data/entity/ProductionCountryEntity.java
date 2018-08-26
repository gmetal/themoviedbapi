package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class ProductionCountryEntity {

    @JsonField
    public String iso31661;
    @JsonField
    public String name;
}
