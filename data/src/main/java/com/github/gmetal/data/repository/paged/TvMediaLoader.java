package com.github.gmetal.data.repository.paged;

import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.data.entity.TvShowEntity;
import com.github.gmetal.data.entity.mapper.Mappers;
import com.github.gmetal.data.entity.response.TvShowsOnAirResponseEntity;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.callback.MediaListCallback;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.lib.Notifiable;

public class TvMediaLoader extends BaseMediaLoader<TvShowsOnAirResponseEntity, TvShowEntity, MediaInfo> {

    public TvMediaLoader(final TheMovieDBService api, final String apiKey) {

        super(TvCallbackPaged::new, TheMovieDBService::getTvShowsCurrentlyOnAir, api, apiKey);
    }

    public static class TvCallbackPaged extends MediaListCallback<TvShowsOnAirResponseEntity, TvShowEntity, MediaInfo> {

        public TvCallbackPaged(final Notifiable<PagedEntity<MediaInfo>, Throwable> notifiable) {
            super(notifiable, Mappers::convertAsMediaInfo);
        }
    }
}