package com.github.gmetal.presentation.ui.movielist.mvp

import com.github.gmetal.domain.interactor.GetLatestMoviesUseCase
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable
import com.github.gmetal.presentation.mappers.ModelMappers.asMovie
import com.github.gmetal.presentation.model.MovieModel
import com.github.gmetal.presentation.ui.common.mvp.BasePresenter

class MovieListPresenter(private val latestMoviesUseCase: GetLatestMoviesUseCase) : BasePresenter<List<MovieModel>, MovieListView>() {

    var isLoadingMore: Boolean = false

    fun loadData(pageNumber: Int) {

        if (isLoadingMore) {
            return
        }

        isLoadingMore = true

        view?.showLoading()

        latestMoviesUseCase.buildUseCase(GetLatestMoviesUseCase.Params.forPage(pageNumber), Notifiable<PagedEntity<MediaInfo>, Throwable>(
                { pagedEntity ->
                    view?.setData(pagedEntity.dataList
                            .map { asMovie(it) }
                            .toList()
                    )
                    isLoadingMore = false
                },
                { t: Throwable -> view?.showError(t) }))
    }
}