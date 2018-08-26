package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class ProductionCompany {

    @JsonField
    public String name;
    @JsonField
    public Integer id;
}
