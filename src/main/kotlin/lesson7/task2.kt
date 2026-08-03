package org.example.lesson7

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2026

fun main() {
    print("Введите год рождения: ")
    val birthYear = readln().trim().toInt()

    val age = CURRENT_YEAR - birthYear
    if (age >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}