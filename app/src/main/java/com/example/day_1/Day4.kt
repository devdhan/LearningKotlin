package com.example.day_1

fun main() {
    about()
    ifStatement(10, 20)
    elseIfStatement(12)
    whenStatement(50)
    example(13, 21)
    exampleTwo(28)
    exampleThree("Daniel")
}

fun about() {
    val aboutMe = arrayOf("Daniel", "Bolaji", "Yankee", "Portable")
    println(aboutMe[2])
}
fun ifStatement(a: Int, b: Int){
    if(a > b){
        println("Yes")
    }else{
        println("No")
    }
}
fun elseIfStatement(timenow: Int){
    val timeOfDay = if(timenow < 6){
        "Early Moring"
    }else if(timenow < 12){
        "Morning"
    }else if(timenow < 18){
        "Afternoon"
    }else if(timenow < 20){
        "Evening"
    }else{
        "Nothing"
    }
}

fun whenStatement(number: Int) {
    when (number){
        13 -> println("Answer is 13")
        25 -> println("Answer is 25")
        46 -> println("Answer is 46")
        else -> println("Answer is Zero")
    }
}
fun example(a: Int, b: Int){
    if(a > b){
        println("I have more power on my Phone")
    }else{
        println("I have more power on my Laptop")
    }
}

fun exampleTwo(age: Int){
    val personAge = if (age < 10){
        println("I am a Baby")
    }else if(age < 30){
        println("I am a young adult")
    }else if(age < 60){
        println("I am getting old")
    }else if(age < 100){
        println("I am very old")
    }else{
        println("Nothing")
    }
}
fun exampleThree(name: String){
    when(name){
        "Tola" -> println("This is Tola")
        "Lolu" -> println("This is Lolu")
        "Ada" -> println("This is Ada")
        "Daniel" -> println("This is Daniel")
        else -> println("NO Name")
    }
}