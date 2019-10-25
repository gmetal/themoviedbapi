package com.github.gmetal.domain.repository

import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.MovieMediaDetail
import com.github.gmetal.lib.Notifiable

interface MoviesDataSource {

    fun getLatestMovies(pageNumber: Int,
                        notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>)

    fun getById(id: String, notifiable: Notifiable<MovieMediaDetail, Throwable>)
}
