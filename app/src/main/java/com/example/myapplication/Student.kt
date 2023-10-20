package com.example.myapplication

class Student(val grade: Int) : Person(222), Study {
    //    val grade = 0

    init {
        println("grade = " + grade)
    }

    override fun readBooks() {
        println("reading")
    }
}