package com.github.gmetal.data.injection

import com.github.aurae.retrofit2.LoganSquareConverterFactory
import com.github.gmetal.data.net.TheMovieDBService

import javax.inject.Named
import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
class NetModule {

    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient {

        return OkHttpClient.Builder()
                .build()
    }

    @Singleton
    @Provides
    fun providesRetrofit(@Named("base_url") baseUrl: String, okHttpClient: OkHttpClient): Retrofit {

        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(LoganSquareConverterFactory.create())
                .build()
    }

    @Singleton
    @Provides
    fun providesTheMovieDbService(retrofit: Retrofit): TheMovieDBService {

        return retrofit.create(TheMovieDBService::class.java)
    }
}
