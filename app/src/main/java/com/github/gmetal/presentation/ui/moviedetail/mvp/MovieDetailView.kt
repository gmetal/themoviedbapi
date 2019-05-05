package com.github.gmetal.presentation.ui.moviedetail.mvp

import com.github.gmetal.presentation.model.MovieModel

interface MovieDetailView {
    fun showError(error: Throwable)
    fun setData(data: MovieModel)
    fun showContent()
    fun showLoading()
    fun showEmpty(isError: Boolean)
}