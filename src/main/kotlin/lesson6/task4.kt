package org.example.lesson6

const val HANDS_EXERCISES = 1
const val PRESS_EXERCISES = 1
const val LEGS_EXERCISES = 0
const val BACK_EXERCISES = 0

fun main() {
    val currentDay = 5

    println("Упражнения для рук: ${currentDay % 2 == HANDS_EXERCISES}\nУпражнения для ног: ${currentDay % 2 == LEGS_EXERCISES}\nУпражнения для спины: ${currentDay % 2 == BACK_EXERCISES}\nУпражнения для пресса: ${currentDay % 2 == PRESS_EXERCISES}")
}