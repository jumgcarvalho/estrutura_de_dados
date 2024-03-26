package filaEstaticaCircular

fun main() {
    var fila = FilaEstaticaCircular(10)
    fila.enfileirar("A")
    fila.enfileirar("B")
    fila.enfileirar("C")
    println("Fila: " + fila.print())
    fila.enfileirar("D")
    fila.enfileirar("E")
    println("Dado desenfileirado: " + fila.desenfileirar())
    println("Nova fila: " + fila.print())
}