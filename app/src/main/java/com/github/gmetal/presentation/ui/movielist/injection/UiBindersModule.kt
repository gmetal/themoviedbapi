package com.github.gmetal.presentation.ui.movielist.injection

import com.github.gmetal.presentation.ui.movielist.MainActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiBindersModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun bindMainActivity(): MainActivity
}
