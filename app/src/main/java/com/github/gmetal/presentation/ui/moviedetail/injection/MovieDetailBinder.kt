package com.github.gmetal.presentation.ui.moviedetail.injection

import com.github.gmetal.presentation.ui.moviedetail.MovieDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MovieDetailBinder {
    @ContributesAndroidInjector(modules = [MovieDetailModule::class])
    internal abstract fun bindMoviewDetailActivity(): MovieDetailActivity
}
