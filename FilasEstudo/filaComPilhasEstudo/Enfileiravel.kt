package filaComPilhasEstudo

interface Enfileiravel {
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun peak(): Any?
    fun update(dado: Any?)

    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun print(): String
}