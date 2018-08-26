package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class AccountEntity extends BaseMoviesDbEntity {

    @JsonField(name = "avatar")
    public GravatarEntity avatar;

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
