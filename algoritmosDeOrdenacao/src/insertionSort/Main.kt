package insertionSort

fun main() {
    val dados = arrayOf(5 , 7, 2 , 6, 1, 4, 3, 0, 9, 8)
    var i = IsertionSort(dados)
    i.print()
    i.ordenar()
    i.print()
}