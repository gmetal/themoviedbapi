package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.TvMediaDetail
import com.github.gmetal.domain.repository.TvSeriesDataSource
import com.github.gmetal.lib.Notifiable

class GetTvShowDetailUseCase(private val tvDataSource: TvSeriesDataSource) : UseCase<GetTvShowDetailUseCase.Params, TvMediaDetail, Throwable>() {

    override fun buildUseCase(params: Params, notifiable: Notifiable<TvMediaDetail, Throwable>) {

        tvDataSource.getById(params.movieId, notifiable)
    }

    class Params(val movieId: String) {
        companion object {

            fun forTvShow(tvShowId: String): Params {
                return Params(tvShowId)
            }
        }
    }
}
