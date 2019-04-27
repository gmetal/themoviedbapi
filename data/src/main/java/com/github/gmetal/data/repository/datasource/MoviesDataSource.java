package com.github.gmetal.domain.repository;

import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.MovieMediaDetail;
import com.github.gmetal.domain.repository.callback.FailureCallback;
import com.github.gmetal.domain.repository.callback.PagedListSuccessCallback;
import com.github.gmetal.domain.repository.callback.SuccessCallback;

public interface MoviesDataSource {

    interface MovieListSuccessCallback extends PagedListSuccessCallback<MediaInfo> {

    }

    interface MovieSuccessCallback extends SuccessCallback<MovieMediaDetail> {

    }

    void getLatestMovies(final int pageNumber,
                         final MovieListSuccessCallback successCallback,
                         final FailureCallback failureCallback);

    void getById(final String id, final MovieSuccessCallback successCallback,
                 final FailureCallback failureCallback);
}
