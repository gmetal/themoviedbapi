package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.entity.MovieEntity;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.domain.repository.MoviesDataSource;
import com.github.gmetal.domain.repository.callback.FailureCallback;

import retrofit2.Call;

import static com.github.gmetal.data.entity.mapper.Mappers.convertAsMediaDetail;

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
    public void getLatestMovies(int pageNumber, MovieListSuccessCallback successCallback,
                                FailureCallback failureCallback) {

        mMoviesMediaLoader.loadData(pageNumber, successCallback, failureCallback);
    }

    @Override
    public void getById(final String id, final MovieSuccessCallback successCallback,
                        final FailureCallback failureCallback) {

        Call<MovieEntity> movieById = mMovieDbService.getMovieById(id, mApiKey);

        movieById.enqueue(new BaseResponseCallback<>(successCallback, failureCallback, r -> convertAsMediaDetail(r.body())));
    }
}
