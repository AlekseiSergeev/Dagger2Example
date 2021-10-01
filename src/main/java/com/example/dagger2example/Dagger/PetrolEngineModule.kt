package com.example.dagger2example.Dagger

import com.example.dagger2example.Car.Engine
import com.example.dagger2example.Car.PetrolEngine
import dagger.Binds
import dagger.Module


@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}