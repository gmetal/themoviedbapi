package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.repository.callback.FailureCallback;
import com.github.gmetal.data.repository.callback.PagedListSuccessCallback;
import com.github.gmetal.data.repository.callback.SuccessCallback;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.TvMediaDetail;

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
