package com.karpovich.dependencyinjectionexample.example2.di

import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.karpovich.dependencyinjectionexample.example2.data.repository.ExampleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository

}