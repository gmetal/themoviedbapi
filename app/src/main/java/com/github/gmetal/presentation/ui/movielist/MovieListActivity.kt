package com.github.gmetal.presentation.ui.movielist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.gmetal.data.moviedbapi.R
import com.github.gmetal.presentation.model.MovieModel
import com.github.gmetal.presentation.ui.common.mvp.ViewDelegate
import com.github.gmetal.presentation.ui.moviedetail.MovieDetailActivity
import com.github.gmetal.presentation.ui.movielist.mvp.MovieListPresenter
import com.github.gmetal.presentation.ui.movielist.mvp.MovieListView
import dagger.android.AndroidInjection
import javax.inject.Inject

class MovieListActivity : AppCompatActivity(), MovieListView, View.OnClickListener {

    lateinit var movieList: RecyclerView
    lateinit var viewDelegate: ViewDelegate
    @Inject
    lateinit var presenter: MovieListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        viewDelegate = ViewDelegate(findViewById(android.R.id.content), R.id.movie_list)
        movieList = findViewById(R.id.movie_list)

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

    // MovieListView
    override fun showError(error: Throwable) {

        viewDelegate.showError(error)
    }

    override fun setData(data: MutableList<MovieModel>) {

        val adapter = MovieListAdapter(LayoutInflater.from(this), this)
        adapter.data.addAll(data)

        movieList.adapter = adapter
        showContent()
    }

    override fun showContent() {
        viewDelegate.showContent()
    }

    override fun showLoading() {
        viewDelegate.showLoading()
    }

    override fun showEmpty(isError: Boolean) {
        viewDelegate.showEmpty(isError)
    }

    // View.OnClickListener
    override fun onClick(view: View?) {

        startActivity(Intent(this, MovieDetailActivity::class.java))
    }
}
