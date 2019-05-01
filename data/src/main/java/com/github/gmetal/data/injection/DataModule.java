package com.github.gmetal.data.injection;

import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.datasource.RemoteMoviesDataSource;
import com.github.gmetal.data.repository.datasource.RemoteTvSeriesDataSource;
import com.github.gmetal.data.repository.datasource.RemoteUserDataSource;
import com.github.gmetal.domain.repository.MoviesDataSource;
import com.github.gmetal.domain.repository.TheMovieDbRepository;
import com.github.gmetal.domain.repository.TvSeriesDataSource;
import com.github.gmetal.domain.repository.UserDataSource;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Singleton
    @Provides
    public MoviesDataSource providesRemoteMoviesDataSource(final TheMovieDBService theMovieDBService, @Named("api_key") final String apiKey) {

        return new RemoteMoviesDataSource(theMovieDBService, apiKey);
    }

    @Singleton
    @Provides
    public TvSeriesDataSource providesRemoteTvSeriesDataSource(final TheMovieDBService theMovieDBService, @Named("api_key") final String apiKey) {

        return new RemoteTvSeriesDataSource(theMovieDBService, apiKey);
    }

    @Singleton
    @Provides
    public UserDataSource providesRemoteUserDataSource(final TheMovieDBService theMovieDBService, @Named("api_key") final String apiKey) {

        return new RemoteUserDataSource(theMovieDBService, apiKey);
    }

    @Singleton
    @Provides
    public TheMovieDbRepository providesRepository(final RemoteTvSeriesDataSource remoteTvSeriesDataSource, final RemoteMoviesDataSource remoteMoviesDataSource, final RemoteUserDataSource remoteUserDataSource) {

        return new TheMovieDbRepository(remoteTvSeriesDataSource, remoteMoviesDataSource, remoteUserDataSource);
    }
}
