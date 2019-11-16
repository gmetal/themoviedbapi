package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.domain.repository.TvSeriesDataSource
import com.github.gmetal.lib.Notifiable

class GetLatestTvSeriesUseCase(
        private val tvSeriesDataSource: TvSeriesDataSource
) : UseCase<GetLatestTvSeriesUseCase.Params, PagedEntity<MediaInfo>, Throwable>() {

    override fun buildUseCase(params: GetLatestTvSeriesUseCase.Params, notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>) {

        tvSeriesDataSource.getCurrentTvSeries(params.pageNumber, notifiable)
    }

    class Params private constructor(val pageNumber: Int) {
        companion object {

            fun forPage(pageNumber: Int): Params {
                return Params(pageNumber)
            }
        }
    }
}

