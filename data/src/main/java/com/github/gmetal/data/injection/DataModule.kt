package com.github.gmetal.data.injection

import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.datasource.RemoteMoviesDataSource
import com.github.gmetal.data.repository.datasource.RemoteTvSeriesDataSource
import com.github.gmetal.data.repository.datasource.RemoteUserDataSource
import com.github.gmetal.domain.repository.MoviesDataSource
import com.github.gmetal.domain.repository.TheMovieDbRepository
import com.github.gmetal.domain.repository.TvSeriesDataSource
import com.github.gmetal.domain.repository.UserDataSource

import javax.inject.Named
import javax.inject.Singleton

import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Singleton
    @Provides
    fun providesRemoteMoviesDataSource(theMovieDBService: TheMovieDBService, @Named("api_key") apiKey: String): MoviesDataSource {

        return RemoteMoviesDataSource(theMovieDBService, apiKey)
    }

    @Singleton
    @Provides
    fun providesRemoteTvSeriesDataSource(theMovieDBService: TheMovieDBService, @Named("api_key") apiKey: String): TvSeriesDataSource {

        return RemoteTvSeriesDataSource(theMovieDBService, apiKey)
    }

    @Singleton
    @Provides
    fun providesRemoteUserDataSource(theMovieDBService: TheMovieDBService, @Named("api_key") apiKey: String): UserDataSource {

        return RemoteUserDataSource(theMovieDBService, apiKey)
    }

    @Singleton
    @Provides
    fun providesRepository(remoteTvSeriesDataSource: RemoteTvSeriesDataSource, remoteMoviesDataSource: RemoteMoviesDataSource, remoteUserDataSource: RemoteUserDataSource): TheMovieDbRepository {

        return TheMovieDbRepository(remoteTvSeriesDataSource, remoteMoviesDataSource, remoteUserDataSource)
    }
}
