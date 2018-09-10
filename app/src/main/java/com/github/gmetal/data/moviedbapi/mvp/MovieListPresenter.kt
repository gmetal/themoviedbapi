package com.github.gmetal.data.moviedbapi.mvp

import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.repository.MoviesDataSource

class MovieListPresenter(val movieDataSource: MoviesDataSource) {

    var view: MovieListView? = null
    var pageNumber: Int = 1
    var isLoadingMore: Boolean = false

    fun attachView(view: MovieListView) {

        this.view = view
    }

    fun detachView() {

        this.view = null
    }

    fun isViewAttached() = this.view != null

    fun loadData() {

        if (isLoadingMore) {
            return
        }

        isLoadingMore = true


        this.view?.showLoading()

        movieDataSource.getLatestMovies(this.pageNumber,
                { mutableList: MutableList<MediaInfo>, i: Int, i1: Int, i2: Int?, i3: Int? ->
                    this.view?.setData(mutableList)
                    isLoadingMore = false
                },
                { t: Throwable -> view?.showError(t) })
    }
}