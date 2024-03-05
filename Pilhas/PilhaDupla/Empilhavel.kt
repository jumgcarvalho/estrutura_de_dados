interface Empilhavel {
    fun empilhar1(dado: Any?)
    fun desempilhar1(): Any?
    fun topo1(): Any?
    fun empilhar2(dado: Any?)
    fun desempilhar2(): Any?
    fun topo2(): Any?

    fun estaCheia1(): Boolean
    fun estaCheia2(): Boolean
    fun estaVazia1(): Boolean
    fun estaVazia2(): Boolean
    fun imprimir1(): String
    fun imprimir2(): String
}