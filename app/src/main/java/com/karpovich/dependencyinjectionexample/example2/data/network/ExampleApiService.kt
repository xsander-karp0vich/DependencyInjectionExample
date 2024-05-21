package com.karpovich.dependencyinjectionexample.example2.data.network

import android.content.Context
import com.karpovich.dependencyinjectionexample.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context
) {

    fun method() {

    }

}
