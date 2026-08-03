package org.example.lesson5

fun main() {
    val inputString = "D2-D4;0"

    val (stepFrom, stepTo, stepNumber) = inputString.split("-", ";")

    println(stepNumber)
    println(stepFrom)
    println(stepTo)
}