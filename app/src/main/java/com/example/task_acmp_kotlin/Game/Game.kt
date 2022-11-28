package com.example.task_acmp_kotlin.Game

class Game {

    fun readNum(): Int {

        val result = readln()

        println(result)
        return Integer.parseInt(result)
    }

    fun make() {

        val num = readNum()

        val result = 9 - num
        println("$num" + "9" + "$result")

    }

}

