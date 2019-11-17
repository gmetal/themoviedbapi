package com.github.gmetal.presentation.ui.movielist.mvp

import com.github.gmetal.domain.interactor.GetLatestMoviesUseCase
import com.github.gmetal.domain.interactor.GetLatestTvSeriesUseCase
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.FailureCallback
import com.github.gmetal.lib.Notifiable
import com.github.gmetal.lib.SuccessCallback
import com.github.gmetal.presentation.mappers.ModelMappers.asMovie
import com.github.gmetal.presentation.model.MovieModel
import com.github.gmetal.presentation.ui.common.mvp.BasePresenter

class MovieListPresenter(private val latestMoviesUseCase: GetLatestTvSeriesUseCase) : BasePresenter<List<MovieModel>, MovieListView>() {

    var isLoadingMore: Boolean = false

    fun loadData(pageNumber: Int) {

        if (isLoadingMore) {
            return
        }

        isLoadingMore = true

        view?.showLoading()

        latestMoviesUseCase.buildUseCase(
                GetLatestTvSeriesUseCase.Params.forPage(pageNumber),
                Notifiable(
                        object : SuccessCallback<PagedEntity<MediaInfo>> {
                            override fun success(pagedEntity: PagedEntity<MediaInfo>) {
                                view?.setData(
                                        pagedEntity.dataList.map
                                        { asMovie(it) }
                                                .toList()
                                )
                                isLoadingMore = false
                            }
                        },
                        object : FailureCallback<Throwable> {
                            override fun failure(failureObject: Throwable) {
                                view?.showError(failureObject)
                            }
                        }
                )
        )
    }
}