package filaComPilhasEstudo

class FilaEstaticaComPilhasEstudo(var tamanho: Int = 10): Enfileiravel {
    private var pilha1: Empilhavel = PilhaEstaticaEstudo(tamanho)
    private var pilha2: Empilhavel = PilhaEstaticaEstudo(tamanho)

    override fun enfileirar(dado: Any?) {
        if (!isFull()) {
            pilha2.push(dado)
            while (!pilha1.isEmpty()) {
                pilha2.push(pilha1.pop())
            }
            while (!pilha2.isEmpty()) {
                pilha1.push(pilha2.pop())
            }
        } else {
            println("The queue is full")
        }
    }

    override fun desenfileirar(): Any? {
        return pilha1.pop()
    }

    override fun peak(): Any? {
        return pilha1.top()
    }

    override fun update(dado: Any?) {
        pilha1.update(dado)
    }

    override fun print(): String {
        return pilha1.print()
    }

    override fun isEmpty(): Boolean {
        return pilha1.isEmpty()
    }

    override fun isFull(): Boolean {
        return pilha1.isFull()
    }

}