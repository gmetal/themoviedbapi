package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.entity.MovieEntity;
import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.callback.BaseResponseCallback;
import com.github.gmetal.data.repository.paged.MovieMediaLoader;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.MovieMediaDetail;
import com.github.gmetal.lib.Notifiable;

import retrofit2.Call;

import static com.github.gmetal.data.entity.mapper.Mappers.convertAsMediaDetail;

public class RemoteMoviesDataSource implements MoviesDataSource {

    private final MovieMediaLoader mMoviesMediaLoader;
    private final TheMovieDBService mMovieDbService;
    private final String mApiKey;

    public RemoteMoviesDataSource(final TheMovieDBService theMovieDbService, final String apiKey) {

        mMovieDbService = theMovieDbService;
        mApiKey = apiKey;
        mMoviesMediaLoader = new MovieMediaLoader(theMovieDbService, apiKey);
    }

    @Override
    public void getLatestMovies(final int pageNumber,
                                final Notifiable<PagedEntity<MediaInfo>, Throwable> notifiable) {

        mMoviesMediaLoader.loadData(pageNumber, notifiable);
    }

    @Override
    public void getById(final String id,
                        final Notifiable<MovieMediaDetail, Throwable> notifiable) {

        Call<MovieEntity> movieById = mMovieDbService.getMovieById(id, mApiKey);

        movieById.enqueue(new BaseResponseCallback<>(notifiable, r -> convertAsMediaDetail(r.body())));
    }
}
