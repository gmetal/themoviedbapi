package com.github.gmetal.moviedbapi.model.object;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class Result {

    @JsonField(name = "poster_path")
    public String posterPath;
    @JsonField
    public Boolean adult;
    @JsonField
    public String overview;
    @JsonField(name = "release_date")
    public String releaseDate;
    @JsonField(name = "first_air_date")
    public String firstAirDate;
    @JsonField
    public List<Integer> genreIds = new ArrayList<>();
    @JsonField
    public Integer id;
    @JsonField(name = "original_title")
    public String originalTitle;
    @JsonField(name = "original_language")
    public String originalLanguage;
    @JsonField
    public String title;
    @JsonField
    public String name;
    @JsonField(name = "original_name")
    public String originalName;
    @JsonField(name = "backdrop_path")
    public String backdropPath;
    @JsonField
    public Float popularity;
    @JsonField(name = "vote_count")
    public Integer voteCount;
    @JsonField
    public Boolean video;
    @JsonField(name = "vote_average")
    public Float voteAverage;

    /**
     * @return The posterPath
     */
    public String getPosterPath() {

        return posterPath;
    }

    /**
     * @param posterPath The poster_path
     */
    public void setPosterPath(String posterPath) {

        this.posterPath = posterPath;
    }

    /**
     * @return The adult
     */
    public Boolean getAdult() {

        return adult;
    }

    /**
     * @param adult The adult
     */
    public void setAdult(Boolean adult) {

        this.adult = adult;
    }

    /**
     * @return The overview
     */
    public String getOverview() {

        return overview;
    }

    /**
     * @param overview The overview
     */
    public void setOverview(String overview) {

        this.overview = overview;
    }

    /**
     * @return The releaseDate
     */
    public String getReleaseDate() {

        if (releaseDate == null) {
            return firstAirDate;
        }
        return releaseDate;
    }

    /**
     * @param releaseDate The release_date
     */
    public void setReleaseDate(String releaseDate) {

        this.releaseDate = releaseDate;
    }

    /**
     * @return The genreIds
     */
    public List<Integer> getGenreIds() {

        return genreIds;
    }

    /**
     * @param genreIds The genre_ids
     */
    public void setGenreIds(List<Integer> genreIds) {

        this.genreIds = genreIds;
    }

    /**
     * @return The id
     */
    public Integer getId() {

        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {

        this.id = id;
    }

    /**
     * @return The originalTitle
     */
    public String getOriginalTitle() {

        return originalTitle;
    }

    /**
     * @param originalTitle The original_title
     */
    public void setOriginalTitle(String originalTitle) {

        this.originalTitle = originalTitle;
    }

    /**
     * @return The originalLanguage
     */
    public String getOriginalLanguage() {

        return originalLanguage;
    }

    /**
     * @param originalLanguage The original_language
     */
    public void setOriginalLanguage(String originalLanguage) {

        this.originalLanguage = originalLanguage;
    }

    /**
     * @return The title
     */
    public String getTitle() {

        if (title == null) {
            return name;
        }
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {

        this.title = title;
    }

    /**
     * @return The backdropPath
     */
    public String getBackdropPath() {

        return backdropPath;
    }

    /**
     * @param backdropPath The backdrop_path
     */
    public void setBackdropPath(String backdropPath) {

        this.backdropPath = backdropPath;
    }

    /**
     * @return The popularity
     */
    public Float getPopularity() {

        return popularity;
    }

    /**
     * @param popularity The popularity
     */
    public void setPopularity(Float popularity) {

        this.popularity = popularity;
    }

    /**
     * @return The voteCount
     */
    public Integer getVoteCount() {

        return voteCount;
    }

    /**
     * @param voteCount The vote_count
     */
    public void setVoteCount(Integer voteCount) {

        this.voteCount = voteCount;
    }

    /**
     * @return The video
     */
    public Boolean getVideo() {

        return video;
    }

    /**
     * @param video The video
     */
    public void setVideo(Boolean video) {

        this.video = video;
    }

    /**
     * @return The voteAverage
     */
    public Float getVoteAverage() {

        return voteAverage;
    }

    /**
     * @param voteAverage The vote_average
     */
    public void setVoteAverage(Float voteAverage) {

        this.voteAverage = voteAverage;
    }
/*
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
*/
}
