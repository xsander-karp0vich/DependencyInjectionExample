package com.karpovich.dependencyinjectionexample.example2.data.database

import android.content.Context
import android.util.Log
import com.karpovich.dependencyinjectionexample.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d("TAG", "method: time:$timeMillis $this")
    }

}
