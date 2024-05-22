package questao1

class ListaDinamica (var tamanho: Int = 10) {
    var ponteiroInicio: NoDuplo? = null
    var ponteiroFim: NoDuplo? = null
    var quantidade = 0

    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }

    fun inserirFim(dado: Any?) {
        if (!estaCheia()) {
            var noTemp = NoDuplo(dado)
            noTemp.anterior = ponteiroFim
            if (!estaVazia()) {
                ponteiroFim?.proximo = noTemp
            } else {
                ponteiroInicio = noTemp
            }
            ponteiroFim = noTemp
            noTemp.proximo = null
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