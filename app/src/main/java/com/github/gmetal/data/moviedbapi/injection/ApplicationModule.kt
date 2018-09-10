package com.github.gmetal.data.moviedbapi.injection

import android.content.Context
import com.github.gmetal.data.moviedbapi.BuildConfig
import com.github.gmetal.data.moviedbapi.SampleApplication
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Singleton
    @Provides
    fun providesContext(application: SampleApplication): Context = application.applicationContext


    @Singleton
    @Provides
    @Named("api_key")
    fun providesApiKey(appContext: Context): String = BuildConfig.theMovieDbApiKey

    @Singleton
    @Provides
    @Named("base_url")
    fun providesBaseUrl(appContext: Context): String = "https://api.themoviedb.org/"
}
