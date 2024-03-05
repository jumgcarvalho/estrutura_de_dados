interface Empilhavel {
    // Metodos principais
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun topo(): Any?
    // Metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}

class PilhaEstatica : Empilhavel {
   
    //variáveis globais (de instância)
   
    private var ponteiroTopo: Int
    private var dados: Array<Any?>
   
    //construtores
   
    constructor() : this(10)
   
    constructor(tamanho: Int) {
        ponteiroTopo = tamanho
        dados = arrayOfNulls(tamanho)
    }
   
    //métodos auxiliares
   
    override fun estaCheia(): Boolean {
        if (ponteiroTopo == 0)
            return true
        else
            return false
    }
   
    override fun estaVazia(): Boolean {
        return (ponteiroTopo == dados.size)
    }
   
   
    override fun imprimir(): String {
    var resultado = "["
        //iterar a pilha
        for (i in ponteiroTopo .. dados.size - 1){
            if (i==dados.size - 1)
            resultado += "${dados[i]}"
            else
            resultado += "${dados[i]},"
        }
        return "${resultado}]"
        //"[A,Z,G,F]"
    }
   
    //métodos principais
   
    override fun empilhar(dado: Any?){
       if (!estaCheia()) {
                ponteiroTopo--
                dados[ponteiroTopo] = dado
            } else {
                println("Stack is full")
            }
    }
   
    override fun desempilhar(): Any?{
        var retorno: Any? = null
        if (!estaVazia()) {
        retorno = dados[ponteiroTopo]
        ponteiroTopo++
        } else {
            println("Stack is empty")
        }
        return retorno
    }
   
    override fun topo(): Any?{
        var retorno: Any? = null
        if (!estaVazia())
        retorno = dados[ponteiroTopo]
        else {
        println("Stack is empty")
        }
        return retorno
    }
   
}

fun main(args: Array<String>) {
    var pilha = PilhaEstatica(20)
    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")
    println("Topo: " + pilha.topo())
    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    val dadoQualquer = pilha. desempilhar()
    pilha.empilhar("e")
    pilha.empilhar("Tecnologia")
    pilha.empilhar(dadoQualquer)
    println("Dados: " + pilha.imprimir())
}