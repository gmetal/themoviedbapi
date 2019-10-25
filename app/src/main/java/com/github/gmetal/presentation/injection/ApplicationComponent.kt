package com.github.gmetal.presentation.injection

import com.github.gmetal.data.injection.DataModule
import com.github.gmetal.data.injection.NetModule
import com.github.gmetal.presentation.SampleApplication
import com.github.gmetal.presentation.ui.moviedetail.injection.MovieDetailBinder
import com.github.gmetal.presentation.ui.movielist.injection.MovieListBinder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, NetModule::class, AndroidSupportInjectionModule::class,
    ApplicationModule::class, MovieListBinder::class, MovieDetailBinder::class])
interface ApplicationComponent : AndroidInjector<SampleApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: SampleApplication): Builder

        fun applicationModule(applicationModule: ApplicationModule): Builder

        fun dataModule(dataModule: DataModule): Builder

        fun netModule(netModule: NetModule): Builder

        fun build(): ApplicationComponent
    }

    // Injects
    override fun inject(application: SampleApplication)
}
