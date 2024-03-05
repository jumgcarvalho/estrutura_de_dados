interface Empilhavel {
    fun empilhar1(dado: Any?)
    fun desempilhar1(): Any?
    fun topo1(): Any?
    fun empilhar2(dado: Any?)
    fun desempilhar2(): Any?
    fun topo2(): Any?

    fun estaCheia1(): Boolean
    fun estaCheia2(): Boolean
    fun estaVazia1(): Boolean
    fun estaVazia2(): Boolean
    fun imprimir1(): String
    fun imprimir2(): String
}

class PilhaDupla : Empilhavel {
    private var ponteiroTopo1: Int
    private var dados: Array<Any?>
    private var ponteiroTopo2: Int

    constructor() : this(10)

    constructor(tamanho: Int) {
        ponteiroTopo1 = -1;
        ponteiroTopo2 = tamanho;
        dados = arrayOfNulls(tamanho);
    }

    override fun estaCheia1(): Boolean {
        if(ponteiroTopo1 == ponteiroTopo2 - 1)
            return true
        else
            return false
    }

    override fun estaCheia2(): Boolean {
        if(ponteiroTopo2 == ponteiroTopo1 + 1)
            return true
        else
            return false
    }

    override fun estaVazia1(): Boolean {
        if(ponteiroTopo1 == -1)
            return true
        else 
            return false
    }

    override fun estaVazia2(): Boolean {
        if(ponteiroTopo2 == dados.size)
            return true
        else 
            return false
    }

    override fun imprimir1(): String {
        var resultado = "["

        for(i in ponteiroTopo1 downTo 0) {
            if(i==0)
                resultado += "${dados[i]}"
            else
                resultado += "${dados[i]},"
        }
        return "${resultado}]"
    }

    override fun imprimir2(): String {
        var resultado = "["

        for(i in ponteiroTopo2 .. dados.size - 1) {
            if(i==dados.size - 1)
                resultado += "${dados[i]}"
            else
                resultado += "${dados[i]},"
        }
        return "${resultado}]"
    }

    override fun empilhar1(dado: Any?) {
        if(!estaCheia1()) {
            ponteiroTopo1++;
            dados[ponteiroTopo1] = dado
        } else {
            println("The stack is full")
        }
    }

    override fun empilhar2(dado: Any?) {
        if(!estaCheia2()) {
            ponteiroTopo2--;
            dados[ponteiroTopo2] = dado
        } else {
            println("The stack is full")
        }
    }

    override fun desempilhar1(): Any? {
        var retorno: Any? = null
        if(!estaVazia1() && ponteiroTopo1 > -1){
            retorno = dados[ponteiroTopo1]
            ponteiroTopo1--
            println("Desempilhei " + retorno)
        } else {
            println("Empty stack")
        }
        return retorno
    }

    override fun desempilhar2(): Any? {
        var retorno: Any? = null
        if(!estaVazia2() && ponteiroTopo2 < dados.size) {
            retorno = dados[ponteiroTopo2]
            ponteiroTopo2++
            println("Desempilhei " + retorno)
        } else {
            println("Empty stack")
        }

        return retorno
    }

    override fun topo1(): Any? {
        var retorno: Any? = null
        if(!estaVazia1() && ponteiroTopo1 > -1)
            retorno = dados[ponteiroTopo1]
        else
            println("Empty stack")

        return retorno
    }

    override fun topo2(): Any? {
        var retorno: Any? = null
        if(!estaVazia2() && ponteiroTopo2 < dados.size)
            retorno = dados[ponteiroTopo2]
        else
            println("Empty stack")

        return retorno
    }
}

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