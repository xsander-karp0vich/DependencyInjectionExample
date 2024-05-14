package com.karpovich.dependencyinjectionexample.example2.data.database

import android.content.Context
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        timeMillis.toString()
    }

}
