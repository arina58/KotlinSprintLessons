package org.example.lesson6

const val TABLE_COUNT = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesBookedToday < TABLE_COUNT}\nДоступность столиков на завтра: ${tablesBookedTomorrow < TABLE_COUNT}")
}