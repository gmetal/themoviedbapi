package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.repository.callback.FailureCallback;
import com.github.gmetal.data.repository.callback.PagedListSuccessCallback;
import com.github.gmetal.data.repository.callback.SuccessCallback;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.MovieMediaDetail;

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
