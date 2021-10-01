package com.example.dagger2example.Car

import android.util.Log
import javax.inject.Inject

class Remote {
    private val TAG = "Car"

    @Inject
    constructor() {}

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }
}