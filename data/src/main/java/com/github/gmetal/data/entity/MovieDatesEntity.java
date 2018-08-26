package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class MovieDatesEntity {

    @JsonField(name = "minimum")
    public String mMinimum;

    @JsonField(name = "maximum")
    public String mMaximum;
}
