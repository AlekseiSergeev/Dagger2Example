package com.example.dagger2example.Dagger

import com.example.dagger2example.Car.Car
import com.example.dagger2example.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance @Named("horse power") horsePower: Int,
                   @BindsInstance @Named("engine capacity") engineCapacity: Int): ActivityComponent
    }

//    @Subcomponent.Builder
//    interface Builder {
//        @BindsInstance
//        fun horsePower(@Named("horse power") horsePower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder
//
//        fun build(): ActivityComponent
//    }
}