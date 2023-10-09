package app

import data.City
import data.Country


fun main() {
    val city = City("Subang")
    val country = Country("Subang")

    printString(city.name)
    printString(country.name)
}