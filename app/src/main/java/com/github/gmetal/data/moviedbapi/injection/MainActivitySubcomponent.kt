package com.github.gmetal.data.moviedbapi.injection

import com.github.gmetal.data.moviedbapi.MainActivity

import dagger.Subcomponent
import dagger.android.AndroidInjector

@MainActivityScope
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}
