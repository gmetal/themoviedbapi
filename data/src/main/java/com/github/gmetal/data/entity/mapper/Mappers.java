package com.github.gmetal.data.entity.mapper;

import com.github.gmetal.data.entity.AccountEntity;
import com.github.gmetal.data.entity.MovieEntity;
import com.github.gmetal.data.entity.RequestTokenEntity;
import com.github.gmetal.data.entity.SeasonEntity;
import com.github.gmetal.data.entity.SessionEntity;
import com.github.gmetal.data.entity.TvShowEntity;
import com.github.gmetal.domain.model.Account;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.MediaItem;
import com.github.gmetal.domain.model.MovieMediaDetail;
import com.github.gmetal.domain.model.ServerSession;
import com.github.gmetal.domain.model.Token;
import com.github.gmetal.domain.model.TvMediaDetail;
import com.github.gmetal.domain.model.TvSeason;

import static com.github.gmetal.domain.model.MediaItem.IMAGE_PREFIX;

public class Mappers {

    public static Account convert(final AccountEntity accountEntity) {

        final Account account = new Account();
        account.setAvatarHash(accountEntity.avatar.hash);
        account.setId(accountEntity.id);
        account.setIso6391(accountEntity.iso6391);
        account.setIso31661(accountEntity.iso31661);
        account.setName(accountEntity.name);
        account.setIncludeAdult(accountEntity.includeAdult);
        account.setUsername(accountEntity.username);
        return account;
    }

    public static MediaInfo convertAsMediaInfo(final TvShowEntity tvShow) {

        final MediaInfo mediaInfo = new MediaInfo();

        mediaInfo.setName(tvShow.name);
        mediaInfo.setTv(true);
        mediaInfo.setDbId(Integer.toString(tvShow.id));
        mediaInfo.setImageURL(IMAGE_PREFIX + tvShow.posterPath);
        mediaInfo.setOverview(tvShow.overview);
        mediaInfo.setVoteCount(tvShow.voteCount);
        mediaInfo.setVoteAverage(tvShow.voteAverage);

        return mediaInfo;
    }

    public static MediaInfo convert(final MovieEntity movieEntity) {

        final MediaInfo mediaInfo = new MediaInfo();

        mediaInfo.setName(movieEntity.title);
        mediaInfo.setTv(false);
        mediaInfo.setDbId(Integer.toString(movieEntity.id));
        mediaInfo.setImageURL(IMAGE_PREFIX + movieEntity.posterPath);
        mediaInfo.setOverview(movieEntity.overview);
        mediaInfo.setVoteCount(movieEntity.voteCount);
        mediaInfo.setVoteAverage(movieEntity.voteAverage);

        return mediaInfo;
    }

    public static MovieMediaDetail convertAsMediaDetail(final MovieEntity movieEntity) {

        final MovieMediaDetail mediaDetail = new MovieMediaDetail();
        mediaDetail.setAdult(movieEntity.adult);
        mediaDetail.setBackdropPath(MediaItem.IMAGE_PREFIX + movieEntity.backdropPath);
        mediaDetail.setBelongsToCollection(movieEntity.belongsToCollection);
        mediaDetail.setBudget(movieEntity.budget);
        for (int i = 0; i < movieEntity.genreEntities.size(); i++) {
            mediaDetail.getGenres().add(movieEntity.genreEntities.get(i).name);
        }
        mediaDetail.setHomepage(movieEntity.homepage);
        mediaDetail.setId(movieEntity.id);
        mediaDetail.setImdbId(movieEntity.imdbId);
        mediaDetail.setOriginalLanguage(movieEntity.originalLanguage);
        mediaDetail.setOriginalTitle(movieEntity.originalTitle);
        mediaDetail.setOverview(movieEntity.overview);
        mediaDetail.setPopularity(movieEntity.popularity);
        mediaDetail.setPosterPath(MediaItem.IMAGE_PREFIX + movieEntity.posterPath);
        mediaDetail.setReleaseDate(movieEntity.releaseDate);
        mediaDetail.setRevenue(movieEntity.revenue);
        mediaDetail.setRuntime(movieEntity.runtime);
        mediaDetail.setStatus(movieEntity.status);
        mediaDetail.setTagline(movieEntity.tagline);
        mediaDetail.setTitle(movieEntity.title);
        mediaDetail.setVideo(movieEntity.video);
        mediaDetail.setVoteAverage(movieEntity.voteAverage);
        mediaDetail.setVoteCount(movieEntity.voteCount);

        return mediaDetail;
    }


    public static ServerSession convert(final SessionEntity sessionResponse) {

        final ServerSession serverSession = new ServerSession();
        serverSession.setSuccess(sessionResponse.success);
        serverSession.setSessionId(sessionResponse.sessionId);

        return serverSession;
    }

    public static Token convert(final RequestTokenEntity tokenEntity) {

        final Token token = new Token();
        token.setSuccess(tokenEntity.success);
        token.setExpiresAt(tokenEntity.expiresAt);
        token.setRequestToken(tokenEntity.requestToken);

        return token;
    }


    public static TvMediaDetail convert(final TvShowEntity response) {

        final TvMediaDetail tvMediaDetail = new TvMediaDetail();
        tvMediaDetail.setAdult(false);
        tvMediaDetail.setBackdropPath(MediaItem.IMAGE_PREFIX + response.backdropPath);
        for (int i = 0; i < response.genreEntities.size(); i++) {
            tvMediaDetail.getGenres().add(response.genreEntities.get(i).name);
        }
        tvMediaDetail.setHomepage(response.homepage);
        tvMediaDetail.setId(response.id);
        tvMediaDetail.setOriginalLanguage(response.originalLanguage);
        tvMediaDetail.setOriginalTitle(response.originalName);
        tvMediaDetail.setOverview(response.overview);
        tvMediaDetail.setPopularity(response.popularity);
        tvMediaDetail.setPosterPath(MediaItem.IMAGE_PREFIX + response.posterPath);
        tvMediaDetail.setReleaseDate(response.firstAirDate);
        tvMediaDetail.setStatus(response.status);
        tvMediaDetail.setTitle(response.name);
        tvMediaDetail.setVideo(true);
        tvMediaDetail.setVoteAverage(response.voteAverage);
        tvMediaDetail.setVoteCount(response.voteCount);

        for (int i = 0; i < response.seasonEntities.size(); i++) {
            tvMediaDetail.getSeasons().add(convert(response.seasonEntities.get(i)));
        }

        return tvMediaDetail;
    }


    public static TvSeason convert(SeasonEntity seasonEntity) {

        final TvSeason tvSeason = new TvSeason();
        tvSeason.setId(seasonEntity.id);
        tvSeason.setAirDate(seasonEntity.airDate);
        tvSeason.setEpisodeCount(seasonEntity.episodeCount);
        tvSeason.setPosterPath(seasonEntity.posterPath);
        tvSeason.setSeasonNumber(seasonEntity.seasonNumber);

        return tvSeason;
    }
}
