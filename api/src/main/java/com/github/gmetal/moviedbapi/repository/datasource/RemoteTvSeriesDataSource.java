package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.TheMovieDBService;
import com.github.gmetal.moviedbapi.model.response.TvResponse;
import com.github.gmetal.moviedbapi.repository.model.MediaInfo;
import com.github.gmetal.moviedbapi.repository.model.TvMediaDetail;
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
                                   final PagedListSuccessCallback<MediaInfo> successCallback,
                                   final FailureCallback failureCallback) {

        mTvListMediaLoader.loadData(pageNumber, successCallback, failureCallback);
    }

    @Override
    public void getById(final String id, final SuccessCallback<TvMediaDetail> successCallback,
                        final FailureCallback failureCallback) {

        final Call<TvResponse> tvById = mMovieDbService.getTVById(id, mApiKey);
        tvById.enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                                                  response -> new TvMediaDetail(response.body())));
    }
}
