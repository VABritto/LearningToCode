package fundamentos

fun main() {
    val valor: Any = 2

    if (valor is String) println(valor)
    else if (valor !is String) println("Não é uma String") // expressão else if redundante, só pra mostrar o
                                                          // conceito de !is.
}