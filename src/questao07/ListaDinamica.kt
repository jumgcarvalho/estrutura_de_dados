package questao7

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

    fun verificarPosicao(dado: Any?): Int {
        var posicao: Int = 0
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade) {
                if (dado == ponteiroAux?.dado) {
                    posicao = i
                    break
                }
                ponteiroAux = ponteiroAux?.proximo
            }
        } else {
            println("Lista vazia")
        }
        return posicao
    }

    //só para testar o verificarPosicao()
    fun anexar(dado: Any?) {
        if (!estaCheia()) {
            var noTemp = NoDuplo(dado)
            noTemp.anterior = ponteiroFim
            if (!estaVazia()) {
                ponteiroFim?.proximo = noTemp
            } else {
                ponteiroInicio = noTemp
            }
            ponteiroFim = noTemp
            quantidade++
        } else {
            println("Lista cheia!")
        }
    }
}