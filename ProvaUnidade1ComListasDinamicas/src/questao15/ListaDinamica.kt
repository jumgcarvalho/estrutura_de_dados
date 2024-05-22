package questao15

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

    fun apagar(posicao: Int): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 until posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                dado = ponteiroAux?.dado
                var ponteiroAnterior = ponteiroAux?.anterior
                var ponteiroProximo = ponteiroAux?.proximo
                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = ponteiroProximo
                } else {
                    ponteiroInicio = ponteiroInicio?.proximo
                }
                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = ponteiroAnterior
                } else {
                    ponteiroFim = ponteiroFim?.anterior
                }
                quantidade--
            }
        } else {
            println("Lista vazia")
        }
        return dado
    }
}