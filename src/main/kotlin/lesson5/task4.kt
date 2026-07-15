package org.example.lesson5

fun main() {
    var stepNumber = 1
    var stepFrom = "E2"
    var stepTo = "E4"

    println("[$stepFrom-$stepTo;$stepNumber]")

    stepNumber++
    stepFrom = "D2"
    stepTo = "D3"

    println("[$stepFrom-$stepTo;$stepNumber]")
}