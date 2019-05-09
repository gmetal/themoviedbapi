package com.github.gmetal.presentation.ui.common.mvp

open class BasePresenter<T, V : BaseView<T>> {
    protected var view: BaseView<T>? = null

    fun initialiseView(v: V) {
        view = v
    }

    fun deinitialiseView() {
        view = null
    }
}