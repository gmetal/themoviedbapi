package com.github.gmetal.data.repository;

import com.github.gmetal.data.repository.datasource.MoviesDataSource;
import com.github.gmetal.data.repository.datasource.TvSeriesDataSource;
import com.github.gmetal.data.repository.datasource.UserDataSource;

public class TheMovieDbRepository {

    private final MoviesDataSource mRemoteMoviesDataSource;
    private final TvSeriesDataSource mRemoteTvSeriesDataSource;
    private final UserDataSource mRemoteUserDataSource;

    public TheMovieDbRepository(final TvSeriesDataSource remoteTvSeriesDataSource,
                                final MoviesDataSource remoteMoviesDataSource,
                                final UserDataSource remoteUserDataSource) {

        mRemoteTvSeriesDataSource = remoteTvSeriesDataSource;
        mRemoteMoviesDataSource = remoteMoviesDataSource;
        mRemoteUserDataSource = remoteUserDataSource;
    }

    public MoviesDataSource getMoviesDataSource() {

        return mRemoteMoviesDataSource;
    }

    public TvSeriesDataSource getTvSeriesDataSource() {

        return mRemoteTvSeriesDataSource;
    }

    public UserDataSource getUserDataSource() {

        return mRemoteUserDataSource;
    }
}
