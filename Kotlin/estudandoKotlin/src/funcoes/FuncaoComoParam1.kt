package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int = a + b

}

fun somar(a: Int, b: Int): Int = a + b
fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int = funcao(a, b)

fun main() {
    println(calc(2, 3, Operacoes()::somar))
    println(calc(2, 3, ::somar))
}