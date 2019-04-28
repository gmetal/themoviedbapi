package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.entity.TvShowEntity;
import com.github.gmetal.data.entity.mapper.Mappers;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.callback.BaseResponseCallback;
import com.github.gmetal.data.repository.callback.FailureCallback;
import com.github.gmetal.data.repository.paged.TvMediaLoader;

import retrofit2.Call;

public class RemoteTvSeriesDataSource implements TvSeriesDataSource {

    private final TvMediaLoader mTvListMediaLoader;
    private final TheMovieDBService mMovieDbService;
    private final String mApiKey;

    public RemoteTvSeriesDataSource(final TheMovieDBService theMovieDbService,
                                    final String apiKey) {

        mMovieDbService = theMovieDbService;
        mApiKey = apiKey;
        mTvListMediaLoader = new TvMediaLoader(theMovieDbService, apiKey);
    }

    @Override
    public void getCurrentTvSeries(final int pageNumber,
                                   final TvSeriesListSuccessCallback successCallback,
                                   final FailureCallback failureCallback) {

        mTvListMediaLoader.loadData(pageNumber, successCallback, failureCallback);
    }

    @Override
    public void getById(final String id, final TvSeriesSuccessCallback successCallback,
                        final FailureCallback failureCallback) {

        final Call<TvShowEntity> tvById = mMovieDbService.getTVById(id, mApiKey);
        tvById.enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                response -> Mappers.convert(response.body())));
    }
}
