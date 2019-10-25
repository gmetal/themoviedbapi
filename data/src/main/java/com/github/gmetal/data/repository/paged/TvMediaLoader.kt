package com.github.gmetal.data.repository.paged

import com.github.gmetal.data.entity.TvShowEntity
import com.github.gmetal.data.entity.mapper.Mappers
import com.github.gmetal.data.entity.response.TvShowsOnAirResponseEntity
import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.callback.MediaListCallback
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable

class TvMediaLoader(
        api: TheMovieDBService,
        apiKey: String
) : BaseMediaLoader<TvShowsOnAirResponseEntity, TvShowEntity, MediaInfo>(
        {
            TvCallbackPaged(it)
        },
        { obj, key, pageNumber ->
            obj.getTvShowsCurrentlyOnAir(
                    key,
                    pageNumber
            )
        },
        api,
        apiKey
) {
    class TvCallbackPaged(
            notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>
    ) : MediaListCallback<TvShowsOnAirResponseEntity, TvShowEntity, MediaInfo>(
            notifiable,
            { obj -> obj.resultObjects },
            { obj -> Mappers.convertAsMediaInfo(obj) }
    )
}
