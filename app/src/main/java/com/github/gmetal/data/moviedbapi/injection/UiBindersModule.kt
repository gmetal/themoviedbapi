package com.github.gmetal.data.moviedbapi.injection

import com.github.gmetal.data.moviedbapi.MainActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiBindersModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun bindMainActivity(): MainActivity
}
