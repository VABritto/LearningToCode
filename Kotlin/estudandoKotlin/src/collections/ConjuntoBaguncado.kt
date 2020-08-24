package collections

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    // conjunto.get(1) // Sets não são indexados

    conjunto.add(3).print() // Sets não permitem dois elementos iguais.
    conjunto.add(10).print()

    conjunto.size.print()
    conjunto.remove("a").print() // String é diferenciado de Char.
    conjunto.remove('a').print()
    conjunto.contains('a').print()
    conjunto.contains("Texto").print() // É case sensitive
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) // Somente leitura
    // nums.add(4)

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() // Não muda o conjunto
    conjunto.retainAll(nums) // Muda o conjunto
    conjunto.print()
    conjunto.clear()
    conjunto.isEmpty().print()
}