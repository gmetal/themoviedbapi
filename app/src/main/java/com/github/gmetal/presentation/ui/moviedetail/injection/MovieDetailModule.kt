package com.github.gmetal.presentation.ui.moviedetail.injection

import com.github.gmetal.presentation.ui.moviedetail.mvp.MovieDetailPresenter
import dagger.Module
import dagger.Provides

@Module
class MovieDetailModule {

    @Provides
    fun providesMovieDetailPresenter() = MovieDetailPresenter()
}