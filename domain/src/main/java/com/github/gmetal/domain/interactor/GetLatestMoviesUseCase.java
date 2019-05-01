package com.github.gmetal.domain.interactor;

import androidx.annotation.NonNull;

import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.domain.repository.MoviesDataSource;
import com.github.gmetal.lib.Notifiable;

public class GetLatestMoviesUseCase extends UseCase<GetLatestMoviesUseCase.Params, PagedEntity<MediaInfo>, Throwable> {

    private final MoviesDataSource mMoviesDataSource;

    public GetLatestMoviesUseCase(final MoviesDataSource moviesDataSource) {

        mMoviesDataSource = moviesDataSource;
    }

    @Override
    public void buildUseCase(@NonNull final GetLatestMoviesUseCase.Params params, @NonNull final Notifiable<PagedEntity<MediaInfo>, Throwable> notifiable) {

        mMoviesDataSource.getLatestMovies(params.pageNumber, notifiable);
    }

    public static final class Params {

        private int pageNumber;

        private Params(final int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public static Params forPage(final int pageNumber) {
            return new Params(pageNumber);
        }
    }
}

