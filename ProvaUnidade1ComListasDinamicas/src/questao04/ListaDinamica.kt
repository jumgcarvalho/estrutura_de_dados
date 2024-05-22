package questao4

import questao3.NoDuplo

class ListaDinamica(var tamanho: Int = 10) {
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
            if (i == quantidade - 1) {
                resultado += ", "
            }
            ponteiroAux = ponteiroAux?.proximo
        }
        return "${resultado}]"
    }

    fun buscarFim(): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            dadoAux = ponteiroFim?.dado
        } else {
            println("Lista vazia")
        }
        return dadoAux
    }
}