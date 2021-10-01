package com.example.dagger2example

import android.app.Application
import com.example.dagger2example.Dagger.AppComponent
import com.example.dagger2example.Dagger.DaggerAppComponent

class ExampleApp: Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

       component= DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent {
        return component
    }
}