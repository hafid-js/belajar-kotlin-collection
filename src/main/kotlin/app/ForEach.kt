package app

fun main() {
//    for (value in listOf("Eko","Kurniawan","Khannedy")) {
//        println(value)
//    }

    listOf("Eko","Kurniawan","Khannedy").forEach {
        println(it)
    }

    mutableListOf("Eko","Kurniawan","Khannedy").forEachIndexed { index, value ->
        println("$index : $value")
    }
}