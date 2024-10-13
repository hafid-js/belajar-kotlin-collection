package app

fun <T> displayMutableCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
//    displayMutableCollection(listOf("EKo", "Kurniawan")) // ERROR
    displayMutableCollection(mutableListOf("EKo", "Kurniawan"))
//    displayMutableCollection(setOf("Eko", "Kurniawan")) // ERROR
    displayMutableCollection(mutableSetOf("EKo", "Kurniawan"))
//    displayMutableCollection(mapOf("Eko" to "Kurniawan").entries) // ERROR
        displayMutableCollection(mutableMapOf("Eko" to "Kurniawan").entries) // ERROR
}