package com.github.gmetal.data.injection;

import com.github.aurae.retrofit2.LoganSquareConverterFactory;
import com.github.gmetal.data.net.TheMovieDBService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Module
public class NetModule {

    @Singleton
    @Provides
    OkHttpClient providesOkHttpClient() {

        return new OkHttpClient.Builder()
                .build();
    }

    @Singleton
    @Provides
    Retrofit providesRetrofit(@Named("base_url") final String baseUrl, final OkHttpClient okHttpClient) {

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(LoganSquareConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    TheMovieDBService providesTheMovieDbService(final Retrofit retrofit) {

        return retrofit.create(TheMovieDBService.class);
    }
}
