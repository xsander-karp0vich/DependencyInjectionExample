package com.example.dependencyinjectionstart.example1

import com.karpovich.dependencyinjectionexample.example1.ComputerModule
import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)

    fun getKeyboard(): Keyboard

    fun getMouse(): Mouse

    fun getMonitor(): Monitor
}