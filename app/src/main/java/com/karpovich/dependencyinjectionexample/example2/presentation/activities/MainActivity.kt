package com.karpovich.dependencyinjectionexample.example2.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example1.Activity
import com.karpovich.dependencyinjectionexample.R
import com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels.ExampleViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}

