package oo.encapsulamento

private val dentroDoArquivo = 1
//protected val protegidoNaoSuportadoAqui = 1 // Protected não pode ser top level
internal val dentroDoProjeto = 1
val publico = 1 // é redundante informar que é public, pois essa é a visibilidade padrão

private fun dentroDoArquivo() = 1
//protected fun protegidoNaoSuportadoAqui() = 1 // Protected não pode ser top level
internal fun dentroDoProjeto() = 1
fun publico() = 1 // é redundante informar que é public, pois essa é a visibilidade padrão

open class Capsula { // Open sinaliza que a classe está aberta pra ser herdada
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha: Capsula() {
    fun verificarAcesso() {
        // println(dentroDoObjeto) // Private não é transmitido por herança
        // println(Capsula().vaiPorHeranca) //  Não se instancia uma variável que se herdou.
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso() {
    // println(Capsula().dentroDoObjeto())
    // println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())

}