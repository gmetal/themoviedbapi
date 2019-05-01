package com.github.gmetal.presentation.ui.movielist.mvp

import com.github.gmetal.domain.interactor.GetLatestMoviesUseCase
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable
import com.github.gmetal.presentation.mappers.ModelMappers.asMovie

class MovieListPresenter(private val latestMoviesUseCase: GetLatestMoviesUseCase) {

    var view: MovieListView? = null
    var isLoadingMore: Boolean = false

    fun attachView(view: MovieListView) {

        this.view = view
    }

    fun detachView() {

        this.view = null
    }

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
                            .toMutableList()
                    )
                    isLoadingMore = false
                },
                { t: Throwable -> view?.showError(t) }))
    }
}