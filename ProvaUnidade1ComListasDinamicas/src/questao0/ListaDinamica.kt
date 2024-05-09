package questao0

class ListaDinamica (var tamanho: Int = 10) {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0

    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }

    fun inserirInicio (dado: Any?) {
        if (!estaCheia()) {
            var noTemp = NoDuplo(dado)
            if (estaVazia()) {
                ponteiroInicio = noTemp
                ponteiroFim = noTemp
                noTemp.anterior = null
                noTemp.proximo = null
            } else {
                var ponteiroProximo = ponteiroInicio
                ponteiroInicio = noTemp
                ponteiroProximo?.anterior = noTemp
                noTemp.anterior = null
                noTemp.proximo = ponteiroProximo
            }
            quantidade++
        } else {
            println("Lista cheia")
        }
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
}