package com.karpovich.dependencyinjectionexample.example2

import android.app.Application
import com.karpovich.dependencyinjectionexample.example2.di.DaggerApplicationComponent

class ExampleApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(
                this,
                System.currentTimeMillis()
            )
    }

}