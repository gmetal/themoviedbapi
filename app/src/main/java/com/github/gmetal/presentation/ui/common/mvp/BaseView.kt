package com.github.gmetal.presentation.ui.common.mvp

interface BaseView<T> {
    fun showError(error: Throwable)
    fun setData(data: T)
    fun showContent()
    fun showLoading()
    fun showEmpty(isError: Boolean)
}