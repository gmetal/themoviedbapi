package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class Season {

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
