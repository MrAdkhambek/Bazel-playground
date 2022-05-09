package me.adkhambek.hamroh

import dagger.Component
import dagger.Module
import dagger.Provides


@Component(
    modules = [
        ZooModule::class
    ]
)
interface MyZoo {
    fun zoo(): String
}

@Module
object ZooModule {

    @Provides
    fun provideAnimal(): String = "A"
}