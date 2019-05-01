package com.github.gmetal.presentation


import android.app.Activity
import android.app.Application
import com.github.gmetal.data.injection.DataModule
import com.github.gmetal.data.injection.NetModule
import com.github.gmetal.presentation.injection.ApplicationModule
import com.github.gmetal.presentation.injection.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class SampleApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {

        super.onCreate()

        DaggerApplicationComponent.builder().dataModule(DataModule())
                .applicationModule(ApplicationModule())
                .netModule(NetModule())
                .application(this)
                .build().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {

        return dispatchingActivityInjector
    }
}
