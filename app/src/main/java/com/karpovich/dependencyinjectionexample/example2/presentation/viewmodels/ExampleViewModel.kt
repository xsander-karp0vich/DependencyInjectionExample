package com.karpovich.dependencyinjectionexample.example2.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
): ViewModel() {

    private var id: String = ""

    fun method() {
        useCase()
    }
}
