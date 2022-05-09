package me.adkhambek.hamroh

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(KotlinVersion.CURRENT.toString())

            val zooComponent = DaggerMyZoo.builder().build()
            println(zooComponent.zoo())
        }
    }
}