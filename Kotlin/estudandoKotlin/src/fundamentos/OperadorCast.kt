package fundamentos

fun imprimirConceito(nota: Any) {
    when(nota as? Int) { // Com isso ele aceita se não for um valor inteiro, retornando null.
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("F")
        else -> println("Nota inválida")
    }
}

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        imprimirConceito(nota.toInt()) // Convertendo a nota para Int.
    }
}