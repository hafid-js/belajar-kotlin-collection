package app

fun main() {
    val list: List<String> = listOf("Eko","Kurniawan","Khannedy")

//    val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }
    var (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(listMatch)
    println(listNotMatch)
}