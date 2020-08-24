package oo.heranca

import collections.print

open class Animal(val nome: String)

class Cachorro: Animal {
    private val altura: Double

    constructor(nome: String, altura: Double) : super(nome) {
        this.altura = altura
    }

    constructor(nome: String): this(nome, 0.0)

    override fun toString(): String = "$nome tem $altura cm de altura."
}

fun main() {
    val dogAlemao = Cachorro("Spike", 84.3)
    val yorkshire = Cachorro("Lady Di")
    dogAlemao.print()
    yorkshire.print()
}