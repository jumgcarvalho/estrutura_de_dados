package questao11

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

    fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 until posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                ponteiroAux?.dado = dado
            } else {
                println("Posição inválida")
            }
        } else {
            println("Lista vazia")
        }
    }
}