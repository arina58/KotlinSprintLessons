package org.example.lesson6

const val COUNT_CREW_MIN = 55
const val COUNT_CREW_MAX = 70
const val COUNT_PROVISIONS_MIN = 50

fun main() {
    print("Наличие повреждений корпуса: ")
    val isDamagedShip = readln().toBoolean()

    print("Количество человек в экипаже: ")
    val countCrew = readln().toInt()

    print("Количество ящиков провизии: ")
    val countProvisions = readln().toInt()

    print("Метеоусловия благоприятны: ")
    val isFavorableWeather = readln().toBoolean()

    val canShipFloat =
        (!isDamagedShip && countCrew in COUNT_CREW_MIN..COUNT_CREW_MAX && countProvisions > COUNT_PROVISIONS_MIN) ||
                (countCrew == COUNT_CREW_MAX && isFavorableWeather && countProvisions >= COUNT_PROVISIONS_MIN)

    println("Корабль может отправиться в плаванье: $canShipFloat")
}