package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int = nome.length

    override fun equals(other: Any?): Boolean =
            if (other is Objeto) nome.equals(other.nome, ignoreCase = true)
            else false
}

fun main() {
    val conjunto = hashSetOf(
            Objeto("Cadeira", "..."), // Hashcode == 7
            Objeto("Mesa", "..."), // Hashcode == 4
            Objeto("Faca", "..."), // Hashcode == 4
            Objeto("Copa", "...") // Hashcode == 4
    )

    conjunto.contains(Objeto("faca", "???")).print()
    
}