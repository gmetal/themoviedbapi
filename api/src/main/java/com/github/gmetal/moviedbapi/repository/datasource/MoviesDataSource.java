package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.model.MediaInfo;
import com.github.gmetal.moviedbapi.repository.model.MovieMediaDetail;

public interface MoviesDataSource {

    void getLatestMovies(final int pageNumber,
                         final PagedListSuccessCallback<MediaInfo> successCallback,
                         final FailureCallback failureCallback);

    void getById(final String id, final SuccessCallback<MovieMediaDetail> successCallback,
                 final FailureCallback failureCallback);
}
