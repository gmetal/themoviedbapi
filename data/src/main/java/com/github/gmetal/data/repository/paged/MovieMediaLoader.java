package com.github.gmetal.data.repository.paged;

import com.github.gmetal.data.entity.MovieEntity;
import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.data.entity.mapper.Mappers;
import com.github.gmetal.data.entity.response.MoviesNowPlayingResponseEntity;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.callback.MediaListCallback;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.lib.Notifiable;


public class MovieMediaLoader extends BaseMediaLoader<MoviesNowPlayingResponseEntity, MovieEntity, MediaInfo> {

    public MovieMediaLoader(final TheMovieDBService api, final String apiKey) {

        super(MovieCallbackPaged::new, TheMovieDBService::getMoviesNowPlaying, api, apiKey);
    }

    public static class MovieCallbackPaged
            extends MediaListCallback<MoviesNowPlayingResponseEntity, MovieEntity, MediaInfo> {

        public MovieCallbackPaged(final Notifiable<PagedEntity<MediaInfo>, Throwable> notifiable) {

            super(notifiable, Mappers::convert);
        }
    }
}
