package org.example.lesson6

const val WEIGHT_FROM = 35
const val WEIGHT_TO = 100
const val MAX_VOLUME = 100

fun main() {
    val cargoWeight1 = 20
    val cargoVolume1 = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует категории 'Average': ${cargoWeight1 > WEIGHT_FROM && cargoWeight1 <= WEIGHT_TO && cargoVolume1 < MAX_VOLUME}\nГруз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует категории 'Average': ${cargoWeight2 > WEIGHT_FROM && cargoWeight2 <= WEIGHT_TO && cargoVolume2 < MAX_VOLUME}")
}
