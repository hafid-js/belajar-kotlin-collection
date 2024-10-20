package app

fun main() {
    val numbers = listOf(1,4,3,2,5,6,3,4,6)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}