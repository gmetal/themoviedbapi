package com.github.gmetal.presentation.ui.movielist.mvp

import com.github.gmetal.data.repository.datasource.MoviesDataSource
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable

class MovieListPresenter(private val movieDataSource: MoviesDataSource) {

    var view: MovieListView? = null
    var pageNumber: Int = 1
    var isLoadingMore: Boolean = false

    fun attachView(view: MovieListView) {

        this.view = view
    }

    fun detachView() {

        this.view = null
    }

    fun loadData() {

        if (isLoadingMore) {
            return
        }

        isLoadingMore = true

        view?.showLoading()

        movieDataSource.getLatestMovies(this.pageNumber,
                Notifiable<PagedEntity<MediaInfo>, Throwable>(
                        { pagedEntity ->
                            this.view?.setData(pagedEntity.dataList)
                            isLoadingMore = false
                        },
                        { t: Throwable -> view?.showError(t) }
                ))
    }
}