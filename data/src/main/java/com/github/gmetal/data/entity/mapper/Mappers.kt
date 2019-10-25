package com.github.gmetal.data.entity.mapper

import com.github.gmetal.data.entity.*
import com.github.gmetal.domain.model.*
import com.github.gmetal.domain.model.MediaItem.Companion.IMAGE_PREFIX

object Mappers {

    fun convert(accountEntity: AccountEntity): Account {

        val account = Account()
        account.avatarHash = accountEntity.avatar?.hash.orEmpty()
        account.id = accountEntity.id ?: -1
        account.iso6391 = accountEntity.iso6391.orEmpty()
        account.iso31661 = accountEntity.iso31661.orEmpty()
        account.name = accountEntity.name.orEmpty()
        account.isIncludeAdult = accountEntity.includeAdult
        account.username = accountEntity.username.orEmpty()
        return account
    }

    fun convertAsMediaInfo(tvShow: TvShowEntity): MediaInfo {

        val mediaInfo = MediaInfo()

        mediaInfo.name = tvShow.name.orEmpty()
        mediaInfo.isTv = true
        mediaInfo.dbId = Integer.toString(tvShow.id!!)
        mediaInfo.imageURL = IMAGE_PREFIX + tvShow.posterPath!!
        mediaInfo.overview = tvShow.overview.orEmpty()
        mediaInfo.voteCount = tvShow.voteCount
        mediaInfo.voteAverage = tvShow.voteAverage

        return mediaInfo
    }

    fun convert(movieEntity: MovieEntity): MediaInfo {

        val mediaInfo = MediaInfo()

        mediaInfo.name = movieEntity.title.orEmpty()
        mediaInfo.isTv = false
        mediaInfo.dbId = Integer.toString(movieEntity.id!!)
        mediaInfo.imageURL = IMAGE_PREFIX + movieEntity.posterPath!!
        mediaInfo.overview = movieEntity.overview.orEmpty()
        mediaInfo.voteCount = movieEntity.voteCount
        mediaInfo.voteAverage = movieEntity.voteAverage

        return mediaInfo
    }

    fun convertAsMediaDetail(movieEntity: MovieEntity): MovieMediaDetail {

        val mediaDetail = MovieMediaDetail()
        mediaDetail.adult = movieEntity.adult
        mediaDetail.backdropPath = IMAGE_PREFIX + movieEntity.backdropPath!!
        mediaDetail.belongsToCollection = movieEntity.belongsToCollection.orEmpty()
        mediaDetail.budget = movieEntity.budget
        for (i in movieEntity.genreEntities.indices) {
            mediaDetail.genres.add(movieEntity.genreEntities[i].name.orEmpty())
        }
        mediaDetail.homepage = movieEntity.homepage.orEmpty()
        mediaDetail.id = movieEntity.id
        mediaDetail.imdbId = movieEntity.imdbId.orEmpty()
        mediaDetail.originalLanguage = movieEntity.originalLanguage.orEmpty()
        mediaDetail.originalTitle = movieEntity.originalTitle.orEmpty()
        mediaDetail.overview = movieEntity.overview.orEmpty()
        mediaDetail.popularity = movieEntity.popularity
        mediaDetail.posterPath = IMAGE_PREFIX + movieEntity.posterPath!!
        mediaDetail.releaseDate = movieEntity.releaseDate.orEmpty()
        mediaDetail.revenue = movieEntity.revenue
        mediaDetail.runtime = movieEntity.runtime
        mediaDetail.status = movieEntity.status.orEmpty()
        mediaDetail.tagline = movieEntity.tagline.orEmpty()
        mediaDetail.title = movieEntity.title.orEmpty()
        mediaDetail.video = movieEntity.video
        mediaDetail.voteAverage = movieEntity.voteAverage
        mediaDetail.voteCount = movieEntity.voteCount

        return mediaDetail
    }


    fun convert(sessionResponse: SessionEntity): ServerSession {

        val serverSession = ServerSession()
        serverSession.isSuccess = sessionResponse.success
        serverSession.sessionId = sessionResponse.sessionId.orEmpty()

        return serverSession
    }

    fun convert(tokenEntity: RequestTokenEntity): Token {

        val token = Token()
        token.isSuccess = tokenEntity.success
        token.expiresAt = tokenEntity.expiresAt.orEmpty()
        token.requestToken = tokenEntity.requestToken.orEmpty()

        return token
    }


    fun convert(response: TvShowEntity): TvMediaDetail {

        val tvMediaDetail = TvMediaDetail()
        tvMediaDetail.adult = false
        tvMediaDetail.backdropPath = IMAGE_PREFIX + response.backdropPath!!
        for (genreEntity in response.genreEntities) {
            tvMediaDetail.genres.add(genreEntity.name.orEmpty())
        }
        tvMediaDetail.homepage = response.homepage.orEmpty()
        tvMediaDetail.id = response.id
        tvMediaDetail.originalLanguage = response.originalLanguage.orEmpty()
        tvMediaDetail.originalTitle = response.originalName.orEmpty()
        tvMediaDetail.overview = response.overview.orEmpty()
        tvMediaDetail.popularity = response.popularity
        tvMediaDetail.posterPath = IMAGE_PREFIX + response.posterPath!!
        tvMediaDetail.releaseDate = response.firstAirDate.orEmpty()
        tvMediaDetail.status = response.status.orEmpty()
        tvMediaDetail.title = response.name.orEmpty()
        tvMediaDetail.video = true
        tvMediaDetail.voteAverage = response.voteAverage
        tvMediaDetail.voteCount = response.voteCount

        for (sessionEntity in response.seasonEntities) {
            tvMediaDetail.seasons.add(convert(sessionEntity))
        }

        return tvMediaDetail
    }


    fun convert(seasonEntity: SeasonEntity): TvSeason {

        val tvSeason = TvSeason()
        tvSeason.id = seasonEntity.id
        tvSeason.airDate = seasonEntity.airDate.orEmpty()
        tvSeason.episodeCount = seasonEntity.episodeCount
        tvSeason.posterPath = seasonEntity.posterPath.orEmpty()
        tvSeason.seasonNumber = seasonEntity.seasonNumber

        return tvSeason
    }
}
