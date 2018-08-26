package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class TvShow {

    @JsonField(name = "poster_path")
    public String mPosterPath;

    @JsonField(name = "popularity")
    public float mPopularity;

    @JsonField(name = "id")
    public int mId;

    @JsonField(name = "backdrop_path")
    public String mBackdropPath;

    @JsonField(name = "vote_average")
    public float mVoteAverage;

    @JsonField(name = "overview")
    public String mOverview;

    @JsonField(name = "first_air_date")
    public String mFirstAirDate;

    @JsonField(name = "origin_country")
    public List<String> mOriginCountry;

    @JsonField(name = "genre_ids")
    public List<Integer> mGenreIds;

    @JsonField(name = "original_language")
    public String mOriginalLanguage;

    @JsonField(name = "vote_count")
    public int mVoteCount;

    @JsonField(name = "name")
    public String mName;

    @JsonField(name = "original_name")
    public String mOriginalName;

}
