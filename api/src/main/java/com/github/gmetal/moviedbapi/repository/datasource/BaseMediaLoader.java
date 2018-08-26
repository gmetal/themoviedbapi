package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.model.LoadingObject;
import com.github.gmetal.moviedbapi.repository.TheMovieDBService;
import com.github.gmetal.moviedbapi.model.response.BasePagedResponse;
import retrofit2.Call;

public abstract class BaseMediaLoader<R extends BasePagedResponse<O>, O, V extends LoadingObject> {

    private final ApiCallRetriever<R> mApiCallRetriever;
    private final TheMovieDBService mApi;
    private final String mApiKey;
    protected BaseMediaListCallbackRetriever<R, O, V> mMediaListCallbackRetriever;

    public BaseMediaLoader(final BaseMediaListCallbackRetriever<R, O, V> mediaListCallbackRetriever,
                           final ApiCallRetriever<R> apiCallRetriever, final TheMovieDBService api,
                           final String apiKey) {

        mMediaListCallbackRetriever = mediaListCallbackRetriever;
        mApiCallRetriever = apiCallRetriever;
        mApi = api;
        mApiKey = apiKey;
    }

    public void loadData(final int page, final PagedListSuccessCallback<V> successCallback,
                         final FailureCallback failureCallback) {

        final Call<R> apiCall = mApiCallRetriever.retrieveApiCall(mApi, mApiKey, page);
        final MediaListCallback<R, O> mediaListCallback =
            mMediaListCallbackRetriever.retrieveMediaListCallback(successCallback, failureCallback);

        apiCall.enqueue(mediaListCallback);
    }

    @FunctionalInterface
    interface ApiCallRetriever<R> {

        Call<R> retrieveApiCall(final TheMovieDBService api, final String apiKey, final int page);
    }

    @FunctionalInterface
    interface BaseMediaListCallbackRetriever<R extends BasePagedResponse<O>, O, V extends LoadingObject> {

        MediaListCallback<R, O> retrieveMediaListCallback(
            final PagedListSuccessCallback<V> successCallback,
            final FailureCallback failureCallback);
    }
}
