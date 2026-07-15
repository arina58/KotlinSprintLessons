package org.example.lesson5

fun main() {
    val originalNumber = 6

    var resultTable = ""

    for (i in 1..9) {
        resultTable += "$originalNumber x $i = ${originalNumber * i}\n"
    }

    println(resultTable)
}