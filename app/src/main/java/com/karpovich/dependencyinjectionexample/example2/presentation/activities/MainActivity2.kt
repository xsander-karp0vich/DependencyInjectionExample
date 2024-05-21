package com.karpovich.dependencyinjectionexample.example2.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.karpovich.dependencyinjectionexample.R
import com.karpovich.dependencyinjectionexample.example2.ExampleApplication
import com.karpovich.dependencyinjectionexample.example2.di.DaggerApplicationComponent
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ExampleViewModel
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ViewModelFactory
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApplication).component
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}

