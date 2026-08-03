package org.example.lesson5

fun main() {
    val inputString = "D2-D4;0"

    val (stepFrom, stepTo, stepNumber) = inputString.split("-", ";")

    println("stepNumber: $stepNumber")
    println("stepFrom: $stepFrom")
    println("stepTo: $stepTo")
}