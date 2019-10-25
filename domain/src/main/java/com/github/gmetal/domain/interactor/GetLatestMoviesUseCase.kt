package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.domain.repository.MoviesDataSource
import com.github.gmetal.lib.Notifiable

class GetLatestMoviesUseCase(private val mMoviesDataSource: MoviesDataSource) : UseCase<GetLatestMoviesUseCase.Params, PagedEntity<MediaInfo>, Throwable>() {

    override fun buildUseCase(params: GetLatestMoviesUseCase.Params, notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>) {

        mMoviesDataSource.getLatestMovies(params.pageNumber, notifiable)
    }

    class Params private constructor(val pageNumber: Int) {
        companion object {

            fun forPage(pageNumber: Int): Params {
                return Params(pageNumber)
            }
        }
    }
}

