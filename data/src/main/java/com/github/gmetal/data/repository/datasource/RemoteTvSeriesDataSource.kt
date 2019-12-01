package com.github.gmetal.data.repository.datasource

import com.github.gmetal.data.entity.mapper.Mappers
import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.callback.BaseResponseCallback
import com.github.gmetal.data.repository.paged.TvMediaLoader
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.domain.model.TvMediaDetail
import com.github.gmetal.domain.repository.TvSeriesDataSource
import com.github.gmetal.lib.Notifiable

class RemoteTvSeriesDataSource(private val mMovieDbService: TheMovieDBService,
                               private val mApiKey: String) : TvSeriesDataSource {

    private val mTvListMediaLoader: TvMediaLoader = TvMediaLoader(mMovieDbService, mApiKey)

    override fun getCurrentTvSeries(pageNumber: Int, notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>) {
        mTvListMediaLoader.loadData(pageNumber, notifiable)
    }

    override fun getById(id: String, notifiable: Notifiable<TvMediaDetail, Throwable>) {

        val tvById = mMovieDbService.getTvShowById(id, mApiKey)
        tvById.enqueue(BaseResponseCallback(notifiable) { response -> Mappers.convert(response.body()!!) })
    }
}
