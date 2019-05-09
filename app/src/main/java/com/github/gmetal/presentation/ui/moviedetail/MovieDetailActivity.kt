package com.github.gmetal.presentation.ui.moviedetail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.gmetal.data.moviedbapi.R
import com.github.gmetal.presentation.model.MovieModel
import com.github.gmetal.presentation.ui.common.mvp.ViewDelegate
import com.github.gmetal.presentation.ui.moviedetail.mvp.MovieDetailPresenter
import com.github.gmetal.presentation.ui.moviedetail.mvp.MovieDetailView
import com.squareup.picasso.Picasso
import dagger.android.AndroidInjection
import javax.inject.Inject

class MovieDetailActivity : AppCompatActivity(), MovieDetailView {
    lateinit var movieImageView: ImageView
    lateinit var movieTitleText: TextView
    lateinit var movieOverviewText: TextView
    lateinit var movieVoteCountText: TextView
    lateinit var movieVoteAverageText: TextView
    lateinit var viewDelegate: ViewDelegate

    @Inject
    lateinit var presenter: MovieDetailPresenter

    @Inject
    lateinit var movieModelId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        initUi()
    }

    fun initUi() {

        movieImageView = findViewById(R.id.movie_image)
        movieTitleText = findViewById(R.id.movie_title)
        movieOverviewText = findViewById(R.id.movie_overview)
        movieVoteCountText = findViewById(R.id.movie_vote_count)
        movieVoteAverageText = findViewById(R.id.movie_vote_average)
        viewDelegate = ViewDelegate(findViewById(android.R.id.content), R.id.view_elements_group)
    }

    override fun onResume() {
        super.onResume()

        presenter.initialiseView(this)
        presenter.loadData(movieModelId)
    }

    override fun onStop() {
        super.onStop()

        presenter.deinitialiseView()
    }

    override fun showError(error: Throwable) {
        viewDelegate.showError(error)
    }

    override fun setData(data: MovieModel) {
        Picasso.get()
                .load(data.imageURL)
                .into(movieImageView)
        movieTitleText.text = data.title
        movieOverviewText.text = data.overview
        movieVoteCountText.text = "${data.voteCount}"
        movieVoteAverageText.text = "${data.voteAverage}"
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
}
