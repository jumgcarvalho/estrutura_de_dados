package filaEstaticaDuplaTerminacaoEstudo

class FilaEstaticaDuplaTerminacaoEstudo(var tamanho: Int = 10): EnfileiravelDupla {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0

    override fun isEmpty(): Boolean {
        return (quantidade == 0)
    }

    override fun isFull(): Boolean {
        return (quantidade == dados.size)
    }

    override fun printFrontToBack(): String {
        var resultado = "["
        if (!isEmpty()) {
            for (i in 0 until quantidade) {
                if (i == quantidade - 1) {
                    resultado += "${dados[(ponteiroInicio + i) % dados.size]}"
                } else {
                    resultado += "${dados[(ponteiroInicio + i) % dados.size]}, "
                }
            }
        } else {
            println("The queue is empty")
        }
        return "${resultado}]"
    }

    override fun printBackToFront(): String {
        var resultado = "["
        var ponteiroAux = ponteiroFim
        if (!isEmpty()) {
            for (i in quantidade - 1 downTo 0) {
                if (i == 0) {
                    resultado += "${dados[ponteiroAux]}"
                } else {
                    resultado += "${dados[ponteiroAux]}, "
                }
                ponteiroAux--
                if (ponteiroAux == -1) {
                    ponteiroAux = dados.size - 1
                }
            }
        } else {
            println("The queue is empty")
        }
        return resultado
    }

    override fun enfileirarFim(dado: Any?) {
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

    override fun enfileirarInicio(dado: Any?) {
        if (!isFull()) {
            ponteiroInicio--
            if (ponteiroInicio == -1) {
                ponteiroInicio = dados.size - 1
                if (quantidade == 0) {
                    ponteiroFim = dados.size - 1
                }
            }
            dados[ponteiroInicio] = dado
            quantidade++
        } else {
            println("The queue is full")
        }
    }

    override fun desenfileirarInicio(): Any? {
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

    override fun desenfileirarFim(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroFim]
            ponteiroFim--
            if (ponteiroFim == -1) {
                ponteiroFim = dados.size - 1
            }
            quantidade--
        } else {
            println("The queue is empty")
        }
        return retorno
    }

    override fun peakInicio(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroInicio]
        } else {
            println("The queue is empty")
        }
        return retorno
    }

    override fun peakFim(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroFim]
        } else {
            println("The queue is empty")
        }
        return retorno
    }

    override fun updateInicio(dado: Any?) {
        if (!isEmpty()) {
            dados[ponteiroInicio] = dado
        } else {
            println("The queue is empty")
        }
    }

    override fun updateFim(dado: Any?) {
        if (!isEmpty()) {
            dados[ponteiroFim] = dado
        } else {
            println("The queue is empty")
        }
    }
}