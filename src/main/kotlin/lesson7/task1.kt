package org.example.lesson7

const val RIGHT_ANSWER = 4

fun main() {
    print("Подтвердите, что вы не бот. Решите пример: 2 + 2 = ")
    val userAnswer = readln().trim().toInt()

    if (userAnswer == RIGHT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}