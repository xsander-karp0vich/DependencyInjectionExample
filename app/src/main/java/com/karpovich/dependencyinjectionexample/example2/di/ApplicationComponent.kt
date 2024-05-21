package com.karpovich.dependencyinjectionexample.example2.di

import android.content.Context
import com.karpovich.dependencyinjectionexample.example2.data.database.ExampleDatabase
import com.karpovich.dependencyinjectionexample.example2.presentation.activities.MainActivity
import com.karpovich.dependencyinjectionexample.example2.presentation.activities.MainActivity2
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ExampleViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

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