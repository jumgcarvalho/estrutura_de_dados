fun main() {
    var pilhas = PilhaDupla(10)
    pilhas.empilhar1(1)
    pilhas.empilhar1(2)
    pilhas.empilhar1(3)
    pilhas.empilhar1(4)
    pilhas.empilhar2(5)
    pilhas.empilhar2(6)
    pilhas.empilhar2(7)
    pilhas.empilhar2(8)
    pilhas.empilhar2(9)
    pilhas.empilhar2(10)
    println("Dados: ")
    println("Pilha1 = ${pilhas.imprimir1()}")
    println("Pilha2 = ${pilhas.imprimir2()}")
    pilhas.desempilhar1()
    pilhas.desempilhar2()
    println("Pilha1 = ${pilhas.imprimir1()}")
    println("Pilha2 = ${pilhas.imprimir2()}")
    println("Pilha1 = ${pilhas.topo1()}")
    println("Pilha2 = ${pilhas.topo2()}")
}


