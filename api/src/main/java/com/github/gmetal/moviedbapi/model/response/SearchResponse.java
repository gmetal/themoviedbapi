package com.github.gmetal.moviedbapi.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gmetal.moviedbapi.model.object.Result;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@JsonObject
@Parcel
public class SearchResponse extends BaseMoviesDbResponse {

    @JsonField
    public Integer page;
    @JsonField
    public List<Result> results = new ArrayList<>();
    @JsonField
    public Integer totalResults;
    @JsonField
    public Integer totalPages;
    //@JsonIgnore
    //public  Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The page
     */
    public Integer getPage() {

        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(Integer page) {

        this.page = page;
    }

    /**
     * @return The results
     */
    public List<Result> getResults() {

        return results;
    }

    /**
     * @param results The results
     */
    public void setResults(List<Result> results) {

        this.results = results;
    }

    /**
     * @return The totalResults
     */
    public Integer getTotalResults() {

        return totalResults;
    }

    /**
     * @param totalResults The total_results
     */
    public void setTotalResults(Integer totalResults) {

        this.totalResults = totalResults;
    }

    /**
     * @return The totalPages
     */
    public Integer getTotalPages() {

        return totalPages;
    }

    /**
     * @param totalPages The total_pages
     */
    public void setTotalPages(Integer totalPages) {

        this.totalPages = totalPages;
    }
/*
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/
}
