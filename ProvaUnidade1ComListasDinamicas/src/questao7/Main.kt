package questao7

fun main() {
    var teste: ListaDinamica = ListaDinamica()
    teste.anexar(0)
    teste.anexar(1)
    teste.anexar(2)
    teste.anexar(3)
    teste.anexar(2)
    println(teste.verificarPosicao(2))
    println(teste.imprimir())
}