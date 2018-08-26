package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class Movie {

    @JsonField(name = "poster_path")
    public String mPosterPath;

    @JsonField(name = "adult")
    public boolean mAdult;

    @JsonField(name = "overview")
    public String mOverview;

    @JsonField(name = "release_date")
    public String mReleaseDate;

    @JsonField(name = "genre_ids")
    public List<Integer> mGenreIds;

    @JsonField(name = "id")
    public int mId;

    @JsonField(name = "original_title")
    public String mOriginalTitle;

    @JsonField(name = "original_language")
    public String mOriginalLanguage;

    @JsonField(name = "title")
    public String mTitle;

    @JsonField(name = "backdrop_path")
    public String mBackdropPath;

    @JsonField(name = "popularity")
    public float mPopularity;

    @JsonField(name = "vote_count")
    public int mVoteCount;

    @JsonField(name = "video")
    public boolean mVideo;

    @JsonField(name = "vote_average")
    public float mVoteAverage;

    @JsonField(name = "dates")
    public MovieDates mDates;
}
