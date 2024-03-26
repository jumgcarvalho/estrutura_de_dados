package filaEstaticaCircular

interface Enfileiravel {
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun peak(): Any?
    fun atualizar(dado: Any?)

    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun print(): String
}