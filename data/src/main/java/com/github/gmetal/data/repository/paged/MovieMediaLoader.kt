package com.github.gmetal.data.repository.paged

import com.github.gmetal.data.entity.MovieEntity
import com.github.gmetal.data.entity.mapper.Mappers
import com.github.gmetal.data.entity.response.MoviesNowPlayingResponseEntity
import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.callback.MediaListCallback
import com.github.gmetal.domain.model.MediaInfo
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable


class MovieMediaLoader(
        api: TheMovieDBService,
        apiKey: String
) : BaseMediaLoader<MoviesNowPlayingResponseEntity, MovieEntity, MediaInfo>(
        { MovieCallbackPaged(it) },
        { obj, key, pageNumber -> obj.getMoviesNowPlaying(key, pageNumber) },
        api,
        apiKey
) {

    class MovieCallbackPaged(
            notifiable: Notifiable<PagedEntity<MediaInfo>, Throwable>
    ) : MediaListCallback<MoviesNowPlayingResponseEntity, MovieEntity, MediaInfo>(
            notifiable,
            { obj -> obj.resultObjects },
            { obj -> Mappers.convert(obj) }
    )
}
