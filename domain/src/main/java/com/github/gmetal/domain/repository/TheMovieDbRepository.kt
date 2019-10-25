package com.github.gmetal.domain.repository

class TheMovieDbRepository(val tvSeriesDataSource: TvSeriesDataSource,
                           val moviesDataSource: MoviesDataSource,
                           val userDataSource: UserDataSource)
