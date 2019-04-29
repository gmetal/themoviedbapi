package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.MovieMediaDetail;
import com.github.gmetal.lib.Notifiable;

public interface MoviesDataSource {

    void getLatestMovies(final int pageNumber,
                         final Notifiable<PagedEntity<MediaInfo>, Throwable> notifiable);

    void getById(final String id, final Notifiable<MovieMediaDetail, Throwable> notifiable);
}
