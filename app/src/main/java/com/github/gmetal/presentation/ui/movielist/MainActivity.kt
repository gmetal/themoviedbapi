package com.github.gmetal.presentation.ui.movielist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.gmetal.data.moviedbapi.R
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.presentation.ui.movielist.mvp.MovieListPresenter
import com.github.gmetal.presentation.ui.movielist.mvp.MovieListView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.LENGTH_LONG
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MovieListView {

    lateinit var movieList: RecyclerView
    lateinit var loadingIndicator: ProgressBar
    lateinit var emptyView: TextView
    @Inject
    lateinit var presenter: MovieListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieList = findViewById(R.id.movie_list)
        loadingIndicator = findViewById(R.id.loading)
        emptyView = findViewById(R.id.empty_view)

        movieList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    override fun onResume() {
        super.onResume()

        presenter.attachView(this)
        presenter.loadData(1)
    }

    override fun onStop() {
        super.onStop()

        presenter.detachView()
    }

    override fun showError(error: Throwable) {

        Snackbar.make(findViewById(android.R.id.content), error.message!!, LENGTH_LONG).show()
    }

    override fun setData(data: MutableList<MediaInfo>) {

        val adapter = MovieListAdapter(LayoutInflater.from(this))
        adapter.data.addAll(data)

        movieList.adapter = adapter
        showContent()
    }

    override fun showContent() {
        movieList.visibility = VISIBLE
        loadingIndicator.visibility = GONE
        emptyView.visibility = GONE
    }

    override fun showLoading() {
        movieList.visibility = GONE
        loadingIndicator.visibility = VISIBLE
        emptyView.visibility = VISIBLE
    }

    override fun showEmpty(isError: Boolean) {
        movieList.visibility = GONE
        loadingIndicator.visibility = GONE
        emptyView.visibility = VISIBLE
    }
}
