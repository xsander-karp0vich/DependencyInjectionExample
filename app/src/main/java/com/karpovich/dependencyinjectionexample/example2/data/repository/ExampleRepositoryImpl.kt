package com.karpovich.dependencyinjectionexample.example2.data.repository

import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleLocalDataSource
import com.karpovich.dependencyinjectionexample.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.karpovich.dependencyinjectionexample.example2.data.mapper.ExampleMapper

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
