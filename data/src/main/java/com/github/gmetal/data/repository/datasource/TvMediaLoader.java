package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.entity.TvShowEntity;
import com.github.gmetal.data.entity.mapper.Mappers;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.net.response.TvShowsOnAirResponseEntity;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.repository.callback.FailureCallback;
import com.github.gmetal.domain.repository.callback.PagedListSuccessCallback;

public class TvMediaLoader extends BaseMediaLoader<TvShowsOnAirResponseEntity, TvShowEntity, MediaInfo> {

    public TvMediaLoader(final TheMovieDBService api, final String apiKey) {

        super(TvCallbackPaged::new, TheMovieDBService::getTvShowsCurrentlyOnAir, api, apiKey);
    }

    public static class TvCallbackPaged extends MediaListCallback<TvShowsOnAirResponseEntity, TvShowEntity> {

        public TvCallbackPaged(final PagedListSuccessCallback<MediaInfo> successCallback,
                               final FailureCallback failureCallback) {

            super(successCallback, failureCallback, Mappers::convertAsMediaInfo);
        }
    }
}
