package com.github.gmetal.data.injection;

import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.TheMovieDbRepository;
import com.github.gmetal.data.repository.datasource.RemoteMoviesDataSource;
import com.github.gmetal.data.repository.datasource.RemoteTvSeriesDataSource;
import com.github.gmetal.data.repository.datasource.RemoteUserDataSource;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Singleton
    @Provides
    public RemoteMoviesDataSource providesRemoteMoviesDataSource(final TheMovieDBService theMovieDBService, @Named("api_key") final String apiKey) {

        return new RemoteMoviesDataSource(theMovieDBService, apiKey);
    }

    @Singleton
    @Provides
    public RemoteTvSeriesDataSource providesRemoteTvSeriesDataSource(final TheMovieDBService theMovieDBService, @Named("api_key") final String apiKey) {

        return new RemoteTvSeriesDataSource(theMovieDBService, apiKey);
    }

    @Singleton
    @Provides
    public RemoteUserDataSource providesRemoteUserDataSource(final TheMovieDBService theMovieDBService, @Named("api_key") final String apiKey) {

        return new RemoteUserDataSource(theMovieDBService, apiKey);
    }

    @Singleton
    @Provides
    public TheMovieDbRepository providesRepository(final RemoteTvSeriesDataSource remoteTvSeriesDataSource, final RemoteMoviesDataSource remoteMoviesDataSource, final RemoteUserDataSource remoteUserDataSource) {

        return new TheMovieDbRepository(remoteTvSeriesDataSource, remoteMoviesDataSource, remoteUserDataSource);
    }
}
