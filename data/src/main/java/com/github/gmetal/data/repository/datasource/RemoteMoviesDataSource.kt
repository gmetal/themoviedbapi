package com.github.gmetal.data.repository.datasource

import com.github.gmetal.data.entity.MovieEntity
import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.callback.BaseResponseCallback
import com.github.gmetal.data.repository.paged.MovieMediaLoader
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.MovieMediaDetail
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.domain.repository.MoviesDataSource
import com.github.gmetal.lib.Notifiable

import retrofit2.Call

import com.github.gmetal.data.entity.mapper.Mappers.convertAsMediaDetail

class RemoteMoviesDataSource(private val mMovieDbService: TheMovieDBService, private val mApiKey: String) : MoviesDataSource {

    private val mMoviesMediaLoader: MovieMediaLoader

    init {
        mMoviesMediaLoader = MovieMediaLoader(mMovieDbService, mApiKey)
    }

    override fun getLatestMovies(pageNumber: Int,
                                 notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>) {

        mMoviesMediaLoader.loadData(pageNumber, notifiable)
    }

    override fun getById(id: String,
                         notifiable: Notifiable<MovieMediaDetail, Throwable>) {

        val movieById = mMovieDbService.getMovieById(id, mApiKey)

        movieById.enqueue(BaseResponseCallback(notifiable) { r -> convertAsMediaDetail(r.body()!!) })
    }
}
