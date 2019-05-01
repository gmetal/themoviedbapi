package com.github.gmetal.presentation.ui.movielist.mvp

import com.github.gmetal.presentation.model.MovieModel

interface MovieListView {

    fun showError(error: Throwable)
    fun setData(data: MutableList<MovieModel>)
    fun showContent()
    fun showLoading()
    fun showEmpty(isError: Boolean)
}