package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.TheMovieDBService;
import com.github.gmetal.moviedbapi.model.response.MovieResponse;
import com.github.gmetal.moviedbapi.repository.model.MediaInfo;
import com.github.gmetal.moviedbapi.repository.model.MovieMediaDetail;
import retrofit2.Call;

public class RemoteMoviesDataSource implements MoviesDataSource {

    private final MovieMediaLoader mMoviesMediaLoader;
    private final TheMovieDBService mMovieDbService;
    private final String mApiKey;

    public RemoteMoviesDataSource(final TheMovieDBService theMovieDbService, final String apiKey) {

        mMovieDbService = theMovieDbService;
        mApiKey = apiKey;
        mMoviesMediaLoader = new MovieMediaLoader(theMovieDbService, apiKey);
    }

    @Override
    public void getLatestMovies(int pageNumber, PagedListSuccessCallback<MediaInfo> successCallback,
                                FailureCallback failureCallback) {

        mMoviesMediaLoader.loadData(pageNumber, successCallback, failureCallback);
    }

    @Override
    public void getById(final String id, final SuccessCallback<MovieMediaDetail> successCallback,
                        final FailureCallback failureCallback) {

        Call<MovieResponse> movieById = mMovieDbService.getMovieById(id, mApiKey);

        movieById.enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                                                     r -> new MovieMediaDetail(r.body())));
    }
}
