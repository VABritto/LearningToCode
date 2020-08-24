package oo.heranca

import collections.print

fun main() {
    val carro = Ferrari()
    carro.acelerar()
    carro.print()

    carro.ligarTurbo()
    carro.acelerar()
    carro.print()
    carro.frear()
    carro.frear()
    carro.print()
}