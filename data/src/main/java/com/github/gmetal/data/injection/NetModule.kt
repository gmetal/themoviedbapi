package com.github.gmetal.data.injection

import com.github.gmetal.data.net.TheMovieDBService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetModule {

    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient {

        return OkHttpClient.Builder()
                .build()
    }

    @UseExperimental(UnstableDefault::class)
    @Singleton
    @Provides
    fun providesRetrofit(@Named("base_url") baseUrl: String, okHttpClient: OkHttpClient): Retrofit {

        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(Json.nonstrict.asConverterFactory(MediaType.get("application/json")))
                .build()
    }

    @Singleton
    @Provides
    fun providesTheMovieDbService(retrofit: Retrofit): TheMovieDBService {

        return retrofit.create(TheMovieDBService::class.java)
    }
}
