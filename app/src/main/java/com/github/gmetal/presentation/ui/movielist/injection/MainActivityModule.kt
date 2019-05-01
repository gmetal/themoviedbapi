package com.github.gmetal.presentation.ui.movielist.injection

import com.github.gmetal.domain.interactor.GetLatestMoviesUseCase
import com.github.gmetal.domain.repository.MoviesDataSource
import com.github.gmetal.presentation.ui.movielist.mvp.MovieListPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun providesLatestMoviesUseCase(moviesDataSource: MoviesDataSource) = GetLatestMoviesUseCase(moviesDataSource)

    @Provides
    fun providesMovieListPresenter(moviesUseCase: GetLatestMoviesUseCase) = MovieListPresenter(moviesUseCase)
}
