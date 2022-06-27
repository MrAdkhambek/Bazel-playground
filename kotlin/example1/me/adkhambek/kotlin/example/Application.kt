package me.adkhambek.kotlin.example

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        args.forEach(::println)
        print("Kotlin version = ")
        println(KotlinVersion.CURRENT.toString())
    }
}