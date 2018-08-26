package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class SeasonEntity {

    @JsonField(name = "air_date")
    public String airDate;

    @JsonField(name = "episode_count")
    public Integer episodeCount;

    @JsonField(name = "id")
    public Integer id;

    @JsonField(name = "poster_path")
    public String posterPath;

    @JsonField(name = "season_number")
    public Integer seasonNumber;
}
