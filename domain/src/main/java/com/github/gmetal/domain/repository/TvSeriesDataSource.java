package com.github.gmetal.domain.repository;

import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.TvMediaDetail;
import com.github.gmetal.domain.repository.callback.FailureCallback;
import com.github.gmetal.domain.repository.callback.PagedListSuccessCallback;
import com.github.gmetal.domain.repository.callback.SuccessCallback;

public interface TvSeriesDataSource {

    interface TvSeriesListSuccessCallback extends PagedListSuccessCallback<MediaInfo> {

    }

    interface TvSeriesSuccessCallback extends SuccessCallback<TvMediaDetail> {

    }


    void getCurrentTvSeries(final int pageNumber,
                            final TvSeriesListSuccessCallback successCallback,
                            final FailureCallback failureCallback);

    void getById(final String id, final TvSeriesSuccessCallback successCallback,
                 final FailureCallback failureCallback);
}
