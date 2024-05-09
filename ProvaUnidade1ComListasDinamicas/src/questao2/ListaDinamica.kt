package questao2

class ListaDinamica(val tamanho: Int = 10) {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0;

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

    fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                var noTemp = NoDuplo(dado)
                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio
                for (i in 0 until posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = noTemp
                } else {
                    ponteiroInicio = noTemp
                }

                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = noTemp
                } else {
                    ponteiroFim = noTemp
                }

                noTemp.anterior = ponteiroAnterior
                noTemp.proximo = ponteiroProximo
                quantidade++
            } else {
                println("Posição inválida")
            }
        } else {
            println("Lista cheia")
        }
    }
}