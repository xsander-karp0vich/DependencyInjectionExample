package com.karpovich.dependencyinjectionexample.example1

import com.example.dependencyinjectionstart.example1.Computer
import com.example.dependencyinjectionstart.example1.ComputerTower
import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.dependencyinjectionstart.example1.Memory
import com.example.dependencyinjectionstart.example1.Monitor
import com.example.dependencyinjectionstart.example1.Mouse
import com.example.dependencyinjectionstart.example1.Processor
import com.example.dependencyinjectionstart.example1.Storage
import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideProcessor(): Processor{
        return Processor()
    }

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }

}