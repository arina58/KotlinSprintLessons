package org.example.lesson6

const val AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "winter"

fun main() {
    val isSunnyWeather = true
    val isOpenTent = true
    val airHumidity = 20
    val currentSeason = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunnyWeather && isOpenTent && airHumidity == AIR_HUMIDITY && currentSeason != UNFAVORABLE_SEASON}")
}