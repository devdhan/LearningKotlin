package com.example.day_1

fun main() {
    //Prompt the user to enter a temperature value
    print("Enter the Temperature Value: ")
    val tempResult = readln()?.toDoubleOrNull()


    //Prompt the user to enter a temperature Scale
    print("Enter the temperature Scale(F for Fahrenheit, C for Celsius): ")
    val tempScaleResult = readln()

    if(tempResult == null){
        println("Invalid input. Enter enter a valid temperature")
        return
    }

    val tempConverted = when (tempScaleResult){
        "F", "f" -> (tempResult - 32) * 5/9
        "C", "c" -> (tempResult - 9/5) + 32
        else -> {
            println("Invalid scale, please enter F or C")
            return
        }
    }

    val originalScale =if(tempScaleResult.equals("F", ignoreCase = true))"Fahrenheit" else "Celsius"
    val targetScale =if(tempScaleResult.equals("F", ignoreCase = true))"Celsius" else "Fahrenheit"

    println("$tempResult $originalScale is equivalent to $tempConverted $targetScale")
}
