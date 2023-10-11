package com.example.day_1

open class Animal{
    open fun makeSound(){
        println("Animal Makes Sound")
    }

    class Dog: Animal(){
        override fun makeSound() {
            println("Dog Barks")
        }
    }

    class Cat: Animal(){
        override fun makeSound() {
            println("Cat Meows")
        }
    }
}

fun main(){
    //val animals = Array<Animal> = arrayOf(Animal(),Animal.Dog(), Animal.Cat())

}