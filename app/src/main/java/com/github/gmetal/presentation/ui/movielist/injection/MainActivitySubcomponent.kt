package com.github.gmetal.presentation.ui.movielist.injection

import com.github.gmetal.presentation.ui.movielist.MainActivity

import dagger.Subcomponent
import dagger.android.AndroidInjector

@MainActivityScope
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}
