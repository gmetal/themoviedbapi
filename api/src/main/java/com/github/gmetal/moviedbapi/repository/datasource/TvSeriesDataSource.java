package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.model.MediaInfo;
import com.github.gmetal.moviedbapi.repository.model.TvMediaDetail;

public interface TvSeriesDataSource {

    void getCurrentTvSeries(final int pageNumber,
                            final PagedListSuccessCallback<MediaInfo> successCallback,
                            final FailureCallback failureCallback);

    void getById(final String id, final SuccessCallback<TvMediaDetail> successCallback,
                 final FailureCallback failureCallback);
}
