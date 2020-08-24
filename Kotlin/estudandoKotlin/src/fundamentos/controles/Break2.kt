package fundamentos.controles

fun main() {

    // Desaconselhável usar, pois reduz clareza.
    externo@for (i in 1..15) {
        for (j in 1..15) {
            if (i == 2 && j == 9) break@externo
            println("[$i, $j]")
        }
        println("----------------")
    }
    println("Fim")
}