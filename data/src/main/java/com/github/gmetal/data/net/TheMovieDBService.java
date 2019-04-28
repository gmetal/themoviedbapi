package com.github.gmetal.data.net;

import com.github.gmetal.data.entity.AccountEntity;
import com.github.gmetal.data.entity.MovieEntity;
import com.github.gmetal.data.entity.response.MoviesNowPlayingResponseEntity;
import com.github.gmetal.data.entity.RequestTokenEntity;
import com.github.gmetal.data.entity.SessionEntity;
import com.github.gmetal.data.entity.TvShowEntity;
import com.github.gmetal.data.entity.response.TvShowsOnAirResponseEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TheMovieDBService {

    @GET("/3/movie/{id}")
    Call<MovieEntity> getMovieById(@Path("id") String id, @Query("api_key") String apiKey);

    @GET("/3/tv/{id}")
    Call<TvShowEntity> getTVById(@Path("id") String id, @Query("api_key") String apiKey);

    @GET("/3/tv/on_the_air")
    Call<TvShowsOnAirResponseEntity> getTvShowsCurrentlyOnAir(@Query("api_key") String apiKey,
                                                              @Query("page") int pageNumber);

    @GET("/3/movie/now_playing")
    Call<MoviesNowPlayingResponseEntity> getMoviesNowPlaying(@Query("api_key") String apiKey,
                                                             @Query("page") int pageNumber);

    @GET("/3/authentication/token/new")
    Call<RequestTokenEntity> getNewRequestToken(@Query("api_key") String apiKey);

    @GET("/3/authentication/session/new")
    Call<SessionEntity> getNewSession(@Query("api_key") String apiKey,
                                      @Query("request_token") String requestToken);

    @GET("/3/account")
    Call<AccountEntity> getAccountDetails(@Query("api_key") String apiKey,
                                          @Query("session_id") String sessionId);
}