package com.github.gmetal.moviedbapi.repository;

import com.github.gmetal.moviedbapi.model.response.AccountResponse;
import com.github.gmetal.moviedbapi.model.response.MovieResponse;
import com.github.gmetal.moviedbapi.model.response.MoviesNowPlayingResponse;
import com.github.gmetal.moviedbapi.model.object.RequestToken;
import com.github.gmetal.moviedbapi.model.response.SessionResponse;
import com.github.gmetal.moviedbapi.model.response.TvResponse;
import com.github.gmetal.moviedbapi.model.response.TvShowsOnAirResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TheMovieDBService {

    @GET("/3/movie/{id}")
    Call<MovieResponse> getMovieById(@Path("id") String id, @Query("api_key") String apiKey);

    @GET("/3/tv/{id}")
    Call<TvResponse> getTVById(@Path("id") String id, @Query("api_key") String apiKey);

    @GET("/3/tv/on_the_air")
    Call<TvShowsOnAirResponse> getTvShowsCurrentlyOnAir(@Query("api_key") String apiKey,
                                                        @Query("page") int pageNumber);

    @GET("/3/movie/now_playing")
    Call<MoviesNowPlayingResponse> getMoviesNowPlaying(@Query("api_key") String apiKey,
                                                       @Query("page") int pageNumber);

    @GET("/3/authentication/token/new")
    Call<RequestToken> getNewRequestToken(@Query("api_key") String apiKey);

    @GET("/3/authentication/session/new")
    Call<SessionResponse> getNewSession(@Query("api_key") String apiKey,
                                        @Query("request_token") String requestToken);

    @GET("/3/account")
    Call<AccountResponse> getAccountDetails(@Query("api_key") String apiKey,
                                            @Query("session_id") String sessionId);
}