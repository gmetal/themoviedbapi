package com.github.gmetal.data.moviedbapi.injection


import com.github.gmetal.data.injection.DataModule
import com.github.gmetal.data.injection.NetModule
import com.github.gmetal.data.moviedbapi.SampleApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(DataModule::class, NetModule::class, AndroidSupportInjectionModule::class, ApplicationModule::class, UiBindersModule::class))
interface ApplicationComponent {

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
    fun inject(application: SampleApplication)
}
