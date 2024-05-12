package com.karpovich.dependencyinjectionexample.example2.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example1.Activity
import com.karpovich.dependencyinjectionexample.R
import com.karpovich.dependencyinjectionexample.example2.di.DaggerApplicationComponent
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ExampleViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component = DaggerApplicationComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}

