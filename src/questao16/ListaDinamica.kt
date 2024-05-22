package questao16

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

    fun apagarTudo(): Array<Any?> {
        var dados: Array<Any?> = arrayOfNulls(quantidade);
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade) {
                dados[i] = ponteiroAux?.dado
                ponteiroAux = ponteiroAux?.proximo
            }
            ponteiroInicio = null
            ponteiroFim = null
            quantidade = 0
        } else {
            println("Lista vazia")
        }
        return dados
    }
}