package com.karpovich.dependencyinjectionexample.example2.di

import com.karpovich.dependencyinjectionexample.example2.presentation.activities.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

}