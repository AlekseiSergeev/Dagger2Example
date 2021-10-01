package com.example.dagger2example.Dagger

import com.example.dagger2example.Car.Rims
import com.example.dagger2example.Car.Tires
import com.example.dagger2example.Car.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModule {
    @Module
    companion object {
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }
}