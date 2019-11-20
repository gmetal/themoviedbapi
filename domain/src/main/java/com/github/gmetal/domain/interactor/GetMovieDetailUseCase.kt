package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.MovieMediaDetail
import com.github.gmetal.domain.repository.MoviesDataSource
import com.github.gmetal.lib.Notifiable

class GetMovieDetailUseCase(private val moviesDataSource: MoviesDataSource) : UseCase<GetMovieDetailUseCase.Params, MovieMediaDetail, Throwable>() {

    override fun buildUseCase(params: Params, notifiable: Notifiable<MovieMediaDetail, Throwable>) {

        moviesDataSource.getById(params.movieId, notifiable)
    }

    class Params(val movieId: String) {
        companion object {

            fun forMovie(movieId: String): Params {
                return Params(movieId)
            }
        }
    }
}
