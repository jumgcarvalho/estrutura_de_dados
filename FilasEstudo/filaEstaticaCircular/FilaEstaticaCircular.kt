package filaEstaticaCircular

class FilaEstaticaCircular(val tamanho: Int = 10): Enfileiravel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0

    override fun isFull(): Boolean {
        return (quantidade == dados.size)
    }

    override fun isEmpty(): Boolean {
        return (quantidade == 0)
    }

    override fun enfileirar(dado: Any?) {
        if (!isFull()) {
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("The queue is full")
        }
    }

    override fun desenfileirar(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroInicio]
            ponteiroInicio++
            if (ponteiroInicio == dados.size) {
                ponteiroInicio = 0
            }
            quantidade--
        } else {
            println("The queue is empty")
        }
        return retorno
    }

    override fun atualizar(dado: Any?) {
        if (!isEmpty()) {
            dados[ponteiroInicio] = dado
        } else {
            println("The queue is empty")
        }
    }

    override fun peak(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroInicio]
        } else {
            println("The queue is empty")
        }
        return retorno
    }

    override fun print(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade) {
            if (i == quantidade - 1) {
                resultado += "${dados[ponteiroAux % dados.size]}"
            } else {
                resultado += "${dados[ponteiroAux % dados.size]}, "
            }
            ponteiroAux++
        }
        return "${resultado}]"
    }

}
