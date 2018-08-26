package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.TheMovieDBService;
import com.github.gmetal.moviedbapi.model.object.TvShow;
import com.github.gmetal.moviedbapi.model.response.TvShowsOnAirResponse;
import com.github.gmetal.moviedbapi.repository.model.MediaInfo;

public class TvMediaLoader extends BaseMediaLoader<TvShowsOnAirResponse, TvShow, MediaInfo> {

    public TvMediaLoader(final TheMovieDBService api, final String apiKey) {

        super(TvCallbackPaged::new, TheMovieDBService::getTvShowsCurrentlyOnAir, api, apiKey);
    }

    public static class TvCallbackPaged extends MediaListCallback<TvShowsOnAirResponse, TvShow> {

        public TvCallbackPaged(final PagedListSuccessCallback<MediaInfo> successCallback,
                               final FailureCallback failureCallback) {

            super(successCallback, failureCallback, MediaInfo::new);
        }
    }
}
