package com.example.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2example.Car.Car
import com.example.dagger2example.Dagger.DieselEngineModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as ExampleApp).getAppComponent()
            .getActivityComponentFactory().create(400, 5000).inject(this)

        car1.drive()
        car2.drive()
    }
}