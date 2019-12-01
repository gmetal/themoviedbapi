package com.github.gmetal.data.net

import com.github.gmetal.data.entity.AccountEntity
import com.github.gmetal.data.entity.MovieEntity
import com.github.gmetal.data.entity.response.MoviesNowPlayingResponseEntity
import com.github.gmetal.data.entity.RequestTokenEntity
import com.github.gmetal.data.entity.SessionEntity
import com.github.gmetal.data.entity.TvShowEntity
import com.github.gmetal.data.entity.response.TvShowsOnAirResponseEntity

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBService {

    @GET("/3/movie/{id}")
    fun getMovieById(@Path("id") id: String, @Query("api_key") apiKey: String): Call<MovieEntity>

    @GET("/3/tv/{id}")
    fun getTvShowById(@Path("id") id: String, @Query("api_key") apiKey: String): Call<TvShowEntity>

    @GET("/3/tv/on_the_air")
    fun getTvShowsCurrentlyOnAir(@Query("api_key") apiKey: String,
                                 @Query("page") pageNumber: Int): Call<TvShowsOnAirResponseEntity>

    @GET("/3/movie/now_playing")
    fun getMoviesNowPlaying(@Query("api_key") apiKey: String,
                            @Query("page") pageNumber: Int): Call<MoviesNowPlayingResponseEntity>

    @GET("/3/authentication/token/new")
    fun getNewRequestToken(@Query("api_key") apiKey: String): Call<RequestTokenEntity>

    @GET("/3/authentication/session/new")
    fun getNewSession(@Query("api_key") apiKey: String,
                      @Query("request_token") requestToken: String): Call<SessionEntity>

    @GET("/3/account")
    fun getAccountDetails(@Query("api_key") apiKey: String,
                          @Query("session_id") sessionId: String): Call<AccountEntity>
}