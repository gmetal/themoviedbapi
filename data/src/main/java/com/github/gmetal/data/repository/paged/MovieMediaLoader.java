package com.github.gmetal.data.repository.paged;

import com.github.gmetal.data.entity.MovieEntity;
import com.github.gmetal.data.entity.mapper.Mappers;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.entity.response.MoviesNowPlayingResponseEntity;
import com.github.gmetal.data.repository.callback.FailureCallback;
import com.github.gmetal.data.repository.callback.MediaListCallback;
import com.github.gmetal.data.repository.callback.PagedListSuccessCallback;
import com.github.gmetal.domain.model.MediaInfo;


public class MovieMediaLoader extends BaseMediaLoader<MoviesNowPlayingResponseEntity, MovieEntity, MediaInfo> {

    public MovieMediaLoader(final TheMovieDBService api, final String apiKey) {

        super(MovieCallbackPaged::new, TheMovieDBService::getMoviesNowPlaying, api, apiKey);
    }

    public static class MovieCallbackPaged
            extends MediaListCallback<MoviesNowPlayingResponseEntity, MovieEntity> {

        public MovieCallbackPaged(final PagedListSuccessCallback<MediaInfo> successCallback,
                                  final FailureCallback failureCallback) {

            super(successCallback, failureCallback, Mappers::convert);
        }
    }
}
