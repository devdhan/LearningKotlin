package com.example.day_1

fun main () {

    //Prompt the user to enter a temperature value
    print("Enter the Temperature Value: ")
    val temperature = readln().toDouble()

    //Prompt the user to enter a temperature Scale
    print("Enter the temperature Scale(F for Fahrenheit, C for Celsius): ")
    val scale = readln()

    if (scale == "F"){
        val celsius = (temperature - 32) * 5 / 9
        println("The temperature $temperature°F is equivalent to $celsius°C")
    }else if (scale == "C"){
        val fahrenheit = (temperature * 9 / 5) + 32
        println("The temperature $temperature°C is equivalent to $fahrenheit°F")
    }else{
        println("Invalid input. Enter either F or C for the temperature scale.")
    }
}



