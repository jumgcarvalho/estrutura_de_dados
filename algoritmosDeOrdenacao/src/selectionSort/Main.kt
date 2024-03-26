package selectionSort

fun main() {
    val dados = arrayOf(5 , 7, 2 , 6, 1, 4, 3, 0, 9, 8)
    var s = SelectionSort(dados)
    s.print()
    s.ordenar()
    s.print()
}