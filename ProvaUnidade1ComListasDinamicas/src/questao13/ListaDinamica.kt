package questao13

class ListaDinamica(val tamanho: Int = 10) {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0

    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }

    fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            resultado += ponteiroAux?.dado
            if (i != quantidade - 1) {
                resultado += ", "
            }
            ponteiroAux = ponteiroAux?.proximo
        }
        return "${resultado}]"
    }

    fun apagarInicio(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = ponteiroInicio?.dado
            var ponteiroProximo = ponteiroInicio?.proximo
            ponteiroInicio = ponteiroInicio?.proximo
            if (ponteiroProximo != null) {
                ponteiroProximo.anterior = null
            } else {
                ponteiroFim = ponteiroFim?.anterior
            }
            quantidade--
        } else {
            println("Lista vazia")
        }
        return dado
    }
}