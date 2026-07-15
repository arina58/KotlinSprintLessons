package org.example.lesson5

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"

    var age = 20

    println("[$surname $name $patronymic, $age]")

    age = 22
    surname = "Сидорова"

    println("[$surname $name $patronymic, $age]")
}