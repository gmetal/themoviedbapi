package com.github.gmetal.presentation.ui.common.mvp

import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.annotation.IdRes
import com.github.gmetal.data.moviedbapi.R
import com.google.android.material.snackbar.Snackbar

class ViewDelegate(val mainView: View, @IdRes val mainContentId: Int) {
    val loadingView: View? = mainView.findViewById(R.id.loading)
    val emptyTextView: View? = mainView.findViewById(R.id.empty_view)
    val mainContaintView: View? = mainView.findViewById(mainContentId)

    fun showError(error: Throwable) {

        error.message?.let {
            Snackbar.make(mainView, it, Snackbar.LENGTH_LONG).show()
        }
    }

    fun showContent() {

        emptyTextView?.visibility = GONE
        loadingView?.visibility = GONE
        mainContaintView?.visibility = VISIBLE
    }

    fun showLoading() {

        emptyTextView?.visibility = GONE
        loadingView?.visibility = VISIBLE
        mainContaintView?.visibility = GONE
    }

    fun showEmpty(isError: Boolean) {

        emptyTextView?.visibility = VISIBLE
        loadingView?.visibility = GONE
        mainContaintView?.visibility = GONE
    }
}