package com.github.gmetal.presentation.mappers

import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.MovieMediaDetail
import com.github.gmetal.presentation.model.MovieModel

object ModelMappers {

    fun asMovie(mediaInfo: MediaInfo): MovieModel {

        val movieModel = MovieModel()
        movieModel.id = mediaInfo.dbId
        movieModel.imageURL = mediaInfo.imageURL
        movieModel.isLoadingObject = false
        movieModel.name = mediaInfo.name
        movieModel.overview = mediaInfo.overview
        movieModel.voteAverage = mediaInfo.voteAverage
        movieModel.voteCount = mediaInfo.voteCount
        return movieModel
    }

    fun asMovie(movieMediaDetail: MovieMediaDetail): MovieModel {

        val movieModel = MovieModel()
        movieModel.id = movieMediaDetail.id!!.toString()
        movieModel.imageURL = movieMediaDetail.posterPath
        movieModel.isLoadingObject = false
        movieModel.name = movieMediaDetail.title
        movieModel.overview = movieMediaDetail.overview
        movieModel.voteAverage = movieMediaDetail.voteAverage
        movieModel.voteCount = movieMediaDetail.voteCount
        return movieModel
    }
}