package com.github.gmetal.presentation.ui.moviedetail.injection

import android.os.Parcelable
import com.github.gmetal.domain.interactor.GetMovieDetailUseCase
import com.github.gmetal.domain.repository.MoviesDataSource
import com.github.gmetal.presentation.model.MovieModel
import com.github.gmetal.presentation.ui.common.Params.Companion.MOVIE_PARAM
import com.github.gmetal.presentation.ui.moviedetail.MovieDetailActivity
import com.github.gmetal.presentation.ui.moviedetail.mvp.MovieDetailPresenter
import dagger.Module
import dagger.Provides
import org.parceler.Parcels

@Module
class MovieDetailModule {

    @Provides
    fun providesGetMovieDetailUseCase(moviesDataSource: MoviesDataSource) = GetMovieDetailUseCase(moviesDataSource)

    @Provides
    fun providesMovieDetailPresenter(movieDetailUseCase: GetMovieDetailUseCase) = MovieDetailPresenter(movieDetailUseCase)

    @Provides
    fun providesMovieModel(movieDetailActivity: MovieDetailActivity): String = (Parcels.unwrap(movieDetailActivity.intent.extras?.get(MOVIE_PARAM) as Parcelable?) as MovieModel).id
}