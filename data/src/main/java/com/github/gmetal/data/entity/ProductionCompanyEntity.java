package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class ProductionCompanyEntity {

    @JsonField
    public String name;
    @JsonField
    public Integer id;
}
