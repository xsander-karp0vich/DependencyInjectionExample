package com.karpovich.dependencyinjectionexample.example2.di

import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleLocalDataSource
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleLocalDataSourceImpl
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleRemoteDataSource
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(implementation: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return implementation
    }

    @Provides
    fun provideRemoteDataSource(implementation: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return implementation
    }

}