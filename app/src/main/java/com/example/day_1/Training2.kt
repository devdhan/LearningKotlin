package com.example.day_1

abstract class Vechicle{
    abstract fun start()
    abstract fun stop()
}

class Car: Vechicle(){
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car stopped")
    }

}

fun main(){
    val car = Car()
    car.start()
    car.stop()
}