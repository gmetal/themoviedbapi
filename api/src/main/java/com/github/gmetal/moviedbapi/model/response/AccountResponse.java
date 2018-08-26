package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.object.Gravatar;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class AccountResponse extends BaseMoviesDbResponse {

    @JsonField(name = "avatar")
    public Gravatar avatar;

    @JsonField(name = "id")
    public Integer id;

    @JsonField(name = "iso_639_1")
    public String iso6391;

    @JsonField(name = "iso_3166_1")
    public String iso31661;

    @JsonField(name = "name")
    public String name;

    @JsonField(name = "include_adult")
    public boolean includeAdult;

    @JsonField(name = "username")
    public String username;
}
