package com.github.gmetal.domain.repository;

public class TheMovieDbRepository {

    private final MoviesDataSource mMoviesDataSource;
    private final TvSeriesDataSource mTvSeriesDataSource;
    private final UserDataSource mUserDataSource;

    public TheMovieDbRepository(final TvSeriesDataSource remoteTvSeriesDataSource,
                                final MoviesDataSource remoteMoviesDataSource,
                                final UserDataSource remoteUserDataSource) {

        mTvSeriesDataSource = remoteTvSeriesDataSource;
        mMoviesDataSource = remoteMoviesDataSource;
        mUserDataSource = remoteUserDataSource;
    }

    public MoviesDataSource getMoviesDataSource() {

        return mMoviesDataSource;
    }

    public TvSeriesDataSource getTvSeriesDataSource() {

        return mTvSeriesDataSource;
    }

    public UserDataSource getUserDataSource() {

        return mUserDataSource;
    }
}
