package com.github.gmetal.domain.repository;

import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.model.TvMediaDetail;
import com.github.gmetal.lib.Notifiable;

public interface TvSeriesDataSource {

    void getCurrentTvSeries(final int pageNumber, final Notifiable<PagedEntity<MediaInfo>, Throwable> notifiable);

    void getById(final String id, final Notifiable<TvMediaDetail, Throwable> notifiable);
}
