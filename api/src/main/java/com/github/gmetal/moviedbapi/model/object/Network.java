package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class Network {

    @JsonField(name = "id")
    public Integer id;
    @JsonField(name = "name")
    public String name;
}
