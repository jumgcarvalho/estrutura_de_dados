package listaEstaticaCircularEstudo

interface Listavel {
    fun anexar(dado: Any?)
    fun inserir(posicao: Int, dado: Any?)
    fun selecionarTodos(): Array<Any?>
    fun selecionar(posicao: Int): Any?
    fun apagar(posicao: Int): Any?
    fun atualizar(posicao: Int, dado: Any?)

    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun print(): String
}