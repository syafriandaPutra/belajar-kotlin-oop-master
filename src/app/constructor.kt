package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2015

    val almaz = Car("Wuling", "Almaz")

    printString(avanza.brand)
    printString(avanza.year)
    printString(almaz.brand)
    printString(almaz.year)
}