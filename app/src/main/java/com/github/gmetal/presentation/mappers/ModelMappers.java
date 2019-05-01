package com.github.gmetal.presentation.mappers;

import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.presentation.model.MovieModel;

public class ModelMappers {

    public static MovieModel asMovie(final MediaInfo mediaInfo) {

        final MovieModel movieModel = new MovieModel();
        movieModel.setId(mediaInfo.getDbId());
        movieModel.setImageURL(mediaInfo.getImageURL());
        movieModel.setIsLoadingObject(false);
        movieModel.setName(mediaInfo.getName());
        movieModel.setOverview(mediaInfo.getOverview());
        movieModel.setVoteAverage(mediaInfo.getVoteAverage());
        movieModel.setVoteCount(mediaInfo.getVoteCount());
        return movieModel;
    }
}
