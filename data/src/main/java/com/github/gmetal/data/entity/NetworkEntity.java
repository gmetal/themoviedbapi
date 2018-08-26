package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class NetworkEntity {

    @JsonField(name = "id")
    public Integer id;
    @JsonField(name = "name")
    public String name;
}
