package com.karpovich.dependencyinjectionexample.example2.data.datasource

import com.karpovich.dependencyinjectionexample.example2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
