package org.example.lesson6

const val HANDS_EXERCISES = 1
const val PRESS_EXERCISES = 1
const val LEGS_EXERCISES = 0
const val BACK_EXERCISES = 0

fun main() {
    val currentDay = 5

    println("""
        %-22s %b
        %-22s %b
        %-22s %b
        %-22s %b
    """.trimIndent().format(
            "Упражнения для рук:",   currentDay % 2 == HANDS_EXERCISES,
            "Упражнения для ног:",   currentDay % 2 == LEGS_EXERCISES,
            "Упражнения для спины:", currentDay % 2 == BACK_EXERCISES,
            "Упражнения для пресса:",currentDay % 2 == PRESS_EXERCISES
        )
    )
}