package com.github.gmetal.presentation.ui.movielist.injection

import com.github.gmetal.data.repository.TheMovieDbRepository
import com.github.gmetal.presentation.ui.movielist.mvp.MovieListPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun providesMovieListPresenter(repository: TheMovieDbRepository) = MovieListPresenter(repository.moviesDataSource)
}
