package filaComPilhasEstudo

interface Empilhavel {
    fun push(dado: Any?)
    fun pop(): Any?
    fun top(): Any?
    fun update(dado: Any?)

    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun print(): String
}