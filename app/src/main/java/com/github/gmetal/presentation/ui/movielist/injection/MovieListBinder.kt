package com.github.gmetal.presentation.ui.movielist.injection

import com.github.gmetal.presentation.ui.movielist.MovieListActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MovieListBinder {

    @ContributesAndroidInjector(modules = [MovieListModule::class])
    internal abstract fun bindMainActivity(): MovieListActivity
}
