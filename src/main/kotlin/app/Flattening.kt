package app

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Eko","Kurniawan","Khannedy"),
        listOf("Eko","Kurniawan","Khannedy"),
        listOf("Eko","Kurniawan","Khannedy")
    )

    val listenString: List<String> = list.flatten()
    println(listenString)

    val members: List<Member> = listOf(
        Member("Eko", listOf("Reading", "Coding")),
        Member("Budi", listOf("Gaming", "Traveling"))
    )

//    val hobbies = members.map { it.hobbies } .flatten()
    val hobbies: List<String> = members.flatMap { it.hobbies }
    println(hobbies)
}