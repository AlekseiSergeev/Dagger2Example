package com.example.dagger2example.Dagger

import com.example.dagger2example.Car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
abstract class DriverModule {
    companion object {
        @Provides
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}