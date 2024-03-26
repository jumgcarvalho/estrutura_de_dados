package filaComPilhasEstudo

class PilhaEstaticaEstudo(var tamanho: Int = 10): Empilhavel {
    private var ponteiroTopo = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun isEmpty(): Boolean {
        return (ponteiroTopo == -1)
    }

    override fun isFull(): Boolean {
        return (ponteiroTopo == dados.size)
    }

    override fun push(dado: Any?) {
        if (!isFull()) {
            ponteiroTopo++
            dados[ponteiroTopo] = dado
        } else {
            println("The stack is full")
        }
    }

    override fun pop(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroTopo]
            ponteiroTopo--
        }
        return retorno
    }

    override fun update(dado: Any?) {
        if (!isEmpty()) {
            dados[ponteiroTopo] = dado
        }
    }

    override fun top(): Any? {
        var retorno: Any? = null
        if (!isEmpty()) {
            retorno = dados[ponteiroTopo]
        }
        return retorno
    }

    override fun print(): String {
        var resultado = "["
        for (i in ponteiroTopo downTo 0) {
            if (i == 0) {
                resultado += "${dados[ponteiroTopo]}"
            } else {
                resultado += "${dados[ponteiroTopo]}, "
            }
        }
        return "${resultado}]"
    }
}