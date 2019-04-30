package com.github.gmetal.presentation.ui.movielist.mvp

import com.github.gmetal.domain.model.MediaInfo

interface MovieListView {

    fun showError(error: Throwable)
    fun setData(data: MutableList<MediaInfo>)
    fun showContent()
    fun showLoading()
    fun showEmpty(isError: Boolean)
}