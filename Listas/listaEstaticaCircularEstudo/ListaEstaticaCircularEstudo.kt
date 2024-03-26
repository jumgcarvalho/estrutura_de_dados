package listaEstaticaCircularEstudo

class ListaEstaticaCircularEstudo(var tamanho: Int = 10): Listavel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var quantidade = 0
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun isEmpty(): Boolean {
        return (quantidade == 0)
    }

    override fun isFull(): Boolean {
        return (quantidade == dados.size)
    }

    override fun print(): String {
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
            println("The list is empty")
        }
        return resultado
    }

    override fun anexar(dado: Any?) {
        if (!isFull()) {
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("The list is full")
        }
    }

    override fun selecionarTodos(): Array<Any?> {
        var retorno: Array<Any?> = arrayOfNulls(quantidade)
        if (!isEmpty()) {
            for (i in 0 until quantidade) {
                retorno[i] = dados[(ponteiroInicio + i) % dados.size]
            }
        } else {
            println("The list is empty")
        }
        return retorno
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!isEmpty()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dados[posicaoFisica] = dado
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is empty")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                retorno = dados[posicaoFisica]
            }
        } else {
            println("The list is empty")
        }
        return retorno
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!isFull()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = ponteiroFim + 1
                for (i in 0 .. quantidade - posicao) {
                    var anterior = ponteiroAux - 1
                    if (ponteiroAux == dados.size) {
                        ponteiroAux = 0
                    }
                    var atual = ponteiroAux
                    dados[atual] = dados[anterior]
                    ponteiroAux--
                    if (ponteiroAux == -1) {
                        ponteiroAux = dados.size - 1
                    }
                }
                dados[posicaoFisica] = dado
                ponteiroFim++
                if (ponteiroFim == dados.size) {
                    ponteiroFim = 0
                }
                quantidade++
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is full")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                retorno = dados[posicaoFisica]
                var ponteiroAux = posicaoFisica
                for (i in 0 until quantidade - posicao) {
                    var atual = ponteiroAux % dados.size
                    var proximo = (ponteiroAux + 1) % dados.size
                    dados[atual] = dados[proximo]
                    ponteiroAux++
                }
                ponteiroFim--
                if (ponteiroFim == -1) {
                    ponteiroFim = dados.size - 1
                }
                quantidade--
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is empty")
        }
        return retorno
    }
}