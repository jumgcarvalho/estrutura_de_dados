fun main() {
    val sorteio = SortearNumero()
    for (i in 0..10) {
        sorteio.sortearNumero()
        println("Número sorteado: ${sorteio.getNumero()}")
        println("Números sorteados até agora: ${sorteio.getNumerosSorteados().joinToString()}")
    }
}