package com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {

    }
}
