package avancado

import collections.print

class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>()

    init {
        add(objeto)
    }

    fun add(novoObjeto: T) {
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar = Caixa("Caneta")
    materialEscolar.add("Lápis")
    materialEscolar.add("Borracha")
    println(materialEscolar)
    val numeros = Caixa(objeto = 1)
    numeros.add(3)
    numeros.print()
}