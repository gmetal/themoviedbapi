package com.github.gmetal.data.moviedbapi.injection

import com.github.gmetal.data.moviedbapi.mvp.MovieListPresenter
import com.github.gmetal.data.repository.TheMovieDbRepository
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun providesMovieListPresenter(repository: TheMovieDbRepository) = MovieListPresenter(repository.moviesDataSource)
}
