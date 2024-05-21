package com.karpovich.dependencyinjectionexample.example2.di

import androidx.lifecycle.ViewModel
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ExampleViewModel
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel

}