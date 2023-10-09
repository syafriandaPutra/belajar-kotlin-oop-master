package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android")

    printString(smartPhone.toString())
    printString(smartPhone.hashCode())
}