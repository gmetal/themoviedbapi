package com.github.gmetal.domain.interactor;

import com.github.gmetal.domain.model.MovieMediaDetail;
import com.github.gmetal.domain.repository.MoviesDataSource;
import com.github.gmetal.lib.Notifiable;

public class GetMovieDetailUseCase extends UseCase<GetMovieDetailUseCase.Params, MovieMediaDetail, Throwable> {

    private final MoviesDataSource mMoviesDataSource;

    public GetMovieDetailUseCase(final MoviesDataSource moviesDataSource) {

        mMoviesDataSource = moviesDataSource;
    }

    @Override
    public void buildUseCase(final GetMovieDetailUseCase.Params params, final Notifiable<MovieMediaDetail, Throwable> notifiable) {

        mMoviesDataSource.getById(params.movieId, notifiable);
    }

    public static final class Params {

        private final String movieId;

        public Params(final String movieId) {
            this.movieId = movieId;
        }

        public static Params forMovie(final String movieId) {
            return new Params(movieId);
        }
    }
}
