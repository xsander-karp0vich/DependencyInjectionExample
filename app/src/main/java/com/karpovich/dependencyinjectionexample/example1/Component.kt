package com.example.dependencyinjectionstart.example1

class Component {

    private fun getComputer(): Computer{
        val monitor = Monitor()
        val mouse = Mouse()
        val keyboard = Keyboard()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    fun inject(activity: Activity){
      //  activity.keyboard = Keyboard()
    }


}