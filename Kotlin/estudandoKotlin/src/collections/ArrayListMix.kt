package collections

fun main() {
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')
    // Smart cast
    for(item in listaMix) if (item is String) println(item.toUpperCase()) else println(item)
}