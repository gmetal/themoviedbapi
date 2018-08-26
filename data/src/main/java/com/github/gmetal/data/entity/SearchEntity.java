package com.github.gmetal.data.entity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;
import java.util.List;

@JsonObject
public class SearchEntity extends BaseMoviesDbEntity {

    @JsonField
    public Integer page;
    @JsonField
    public List<ResultEntity> resultEntities = new ArrayList<>();
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
     * @return The resultEntities
     */
    public List<ResultEntity> getResultEntities() {

        return resultEntities;
    }

    /**
     * @param resultEntities The resultEntities
     */
    public void setResultEntities(List<ResultEntity> resultEntities) {

        this.resultEntities = resultEntities;
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
