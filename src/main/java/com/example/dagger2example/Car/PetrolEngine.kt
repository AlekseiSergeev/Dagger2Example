package com.example.dagger2example.Car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {
    private val TAG = "Car"
    private var horsePower: Int
    private var engineCapacity: Int

    @Inject
    constructor(@Named("horse power") horsePower: Int,
                @Named("engine capacity") engineCapacity: Int) {
        this.horsePower = horsePower
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        Log.d(
            TAG,
            "Petrol engine started.\n Horsepower: $horsePower\n Engine Capacity: $engineCapacity"
        )
    }
}