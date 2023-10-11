package com.example.day_1

class House {
    var color = ""
    var roofColor = ""
    var gateColor = ""
    var location = ""
}

fun main(){

    //create an object of class house
    val houseObject = House()


    houseObject.color = "white"
    houseObject.roofColor = "Brown"
    houseObject.gateColor = "Black"
    houseObject.location = "Nigeria"


    println(houseObject.color)
    println(houseObject.roofColor)
    println(houseObject.gateColor)
    println(houseObject.location)
}