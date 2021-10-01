package com.example.dagger2example.Car

import android.util.Log
import com.example.dagger2example.Dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car {

    private val driver: Driver
    private val engine: Engine
    private val wheels: Wheels
    @Inject
    constructor(driver: Driver, engine: Engine, wheels: Wheels) {
        this.driver = driver
        this.engine = engine
        this.wheels = wheels
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drive $this")
    }

    companion object {
        private const val TAG = "Car"
    }
}