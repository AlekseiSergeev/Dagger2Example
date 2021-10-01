package com.example.dagger2example.Car

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine {
    private val TAG = "Car"
    private var horsePower: Int

    @Inject
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d(TAG, "Diesel engine started. Horsepower: $horsePower")
    }
}