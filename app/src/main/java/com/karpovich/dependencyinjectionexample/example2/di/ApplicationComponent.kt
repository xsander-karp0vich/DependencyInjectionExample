package com.karpovich.dependencyinjectionexample.example2.di

import android.content.Context
import com.karpovich.dependencyinjectionexample.example2.presentation.activities.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    /*@Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent

    }*/

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent

    }

}