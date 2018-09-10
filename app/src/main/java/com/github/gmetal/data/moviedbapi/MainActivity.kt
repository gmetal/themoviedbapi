package com.github.gmetal.data.moviedbapi

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.Snackbar.LENGTH_LONG
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import com.github.gmetal.data.moviedbapi.mvp.MovieListPresenter
import com.github.gmetal.data.moviedbapi.mvp.MovieListView
import com.github.gmetal.domain.model.MediaInfo
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MovieListView {

    lateinit var movieList: RecyclerView
    lateinit var loadingIndicator: ProgressBar
    @Inject
    lateinit var presenter: MovieListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieList = findViewById(R.id.movie_list)
        loadingIndicator = findViewById(R.id.loading)

        movieList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onResume() {
        super.onResume()

        presenter.attachView(this)
        presenter.loadData()
    }

    override fun onStop() {
        super.onStop()

        presenter.detachView()
    }

    override fun showError(error: Throwable) {
        Snackbar.make(findViewById(android.R.id.content), error.message!!, LENGTH_LONG)
    }

    override fun setData(data: MutableList<MediaInfo>) {

        val adapter = MovieListAdapter(LayoutInflater.from(this))
        adapter.data.addAll(data)

        movieList.adapter = adapter
        showContent()
    }

    override fun showContent() {
        movieList.visibility = View.VISIBLE
        loadingIndicator.visibility = View.GONE
    }

    override fun showLoading() {
        movieList.visibility = View.GONE
        loadingIndicator.visibility = View.VISIBLE
    }
}
