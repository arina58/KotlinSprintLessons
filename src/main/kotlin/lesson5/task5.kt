package org.example.lesson5

fun main() {
    val inputString = "D2-D4;0"

    val (stepFrom, stepTo, stepNumber) = inputString.split("-", ";")

    println(stepFrom)
    println(stepTo)
    println(stepNumber)
}