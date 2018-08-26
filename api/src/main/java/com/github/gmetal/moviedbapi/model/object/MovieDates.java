package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class MovieDates {

    @JsonField(name = "minimum")
    public String mMinimum;

    @JsonField(name = "maximum")
    public String mMaximum;
}
