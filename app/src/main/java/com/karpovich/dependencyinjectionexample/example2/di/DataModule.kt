package com.karpovich.dependencyinjectionexample.example2.di

import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleLocalDataSource
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleLocalDataSourceImpl
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleRemoteDataSource
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(implementation: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(implementation: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}