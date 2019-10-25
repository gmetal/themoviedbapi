package com.github.gmetal.presentation


import com.github.gmetal.data.injection.DataModule
import com.github.gmetal.data.injection.NetModule
import com.github.gmetal.presentation.injection.ApplicationModule
import com.github.gmetal.presentation.injection.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class SampleApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().dataModule(DataModule())
                .applicationModule(ApplicationModule())
                .netModule(NetModule())
                .application(this)
                .build()
    }
}
