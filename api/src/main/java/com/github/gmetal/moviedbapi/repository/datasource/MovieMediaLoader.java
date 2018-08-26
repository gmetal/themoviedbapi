package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.TheMovieDBService;
import com.github.gmetal.moviedbapi.model.object.Movie;
import com.github.gmetal.moviedbapi.model.response.MoviesNowPlayingResponse;
import com.github.gmetal.moviedbapi.repository.model.MediaInfo;

public class MovieMediaLoader extends BaseMediaLoader<MoviesNowPlayingResponse, Movie, MediaInfo> {

    public MovieMediaLoader(final TheMovieDBService api, final String apiKey) {

        super(MovieCallbackPaged::new, TheMovieDBService::getMoviesNowPlaying, api, apiKey);
    }

    public static class MovieCallbackPaged
        extends MediaListCallback<MoviesNowPlayingResponse, Movie> {

        public MovieCallbackPaged(final PagedListSuccessCallback<MediaInfo> successCallback,
                                  final FailureCallback failureCallback) {

            super(successCallback, failureCallback, MediaInfo::new);
        }
    }
}
