package com.karpovich.dependencyinjectionexample.example2.data.datasource

import com.karpovich.dependencyinjectionexample.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}
