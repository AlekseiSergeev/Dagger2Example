package com.example.dagger2example.Dagger

import com.example.dagger2example.Car.DieselEngine
import com.example.dagger2example.Car.Engine
import dagger.Module
import dagger.Provides


@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}