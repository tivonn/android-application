package com.example.myapplication

fun main() {
//    val value = largeNumber(2, 1)
//    test()
//    println("value = " + value)
    val student = Student(1)
    println(student)
    student.readBooks()
}

fun largeNumber(num1: Int, num2: Int): Int {
    val value = if (num1 > num2) {
        num1
    } else {
        num2
    }
    return value
}

fun test(): Int {
    val name = "tommy"
    return when (name) {
        "tony" -> 100
        "jimmy" -> 90
        else -> 80
    }
}