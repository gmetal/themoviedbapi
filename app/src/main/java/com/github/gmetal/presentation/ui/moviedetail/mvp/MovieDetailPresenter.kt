package com.github.gmetal.presentation.ui.moviedetail.mvp

import com.github.gmetal.domain.interactor.GetMovieDetailUseCase
import com.github.gmetal.domain.model.MovieMediaDetail
import com.github.gmetal.lib.Notifiable
import com.github.gmetal.presentation.mappers.ModelMappers.asMovie
import com.github.gmetal.presentation.model.MovieModel
import com.github.gmetal.presentation.ui.common.mvp.BasePresenter

class MovieDetailPresenter(private val movieDetailUseCase: GetMovieDetailUseCase) : BasePresenter<MovieModel, MovieDetailView>() {

    fun loadData(movieId: String) {

        view?.showLoading()

        movieDetailUseCase.buildUseCase(
                GetMovieDetailUseCase.Params.forMovie(movieId),
                Notifiable<MovieMediaDetail, Throwable>(
                        { movieMediaDetail ->
                            view?.let {
                                it.setData(asMovie(movieMediaDetail))
                            }
                        },
                        { view?.showError(it) }))
    }
}