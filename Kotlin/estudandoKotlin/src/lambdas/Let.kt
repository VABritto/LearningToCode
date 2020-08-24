package lambdas

fun main() {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for(item in listWithNulls) {
        item?.let {
            println(it)
        }
    }
}