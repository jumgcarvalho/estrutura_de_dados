package selectionSort

class SelectionSort(private var dados: Array<Int>): Ordenavel {

    private fun trocar(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    override fun ordenar() {
        for (i in 0 until dados.size - 1) {
            var indiceMenor = i
            for (j in i+1 until dados.size) {
                if (dados[j] < dados[indiceMenor]) {
                    indiceMenor = j
                }
            }
            trocar(i, indiceMenor)
        }
    }

    override fun print() {
        for (i in 0 until dados.size) {
            print("${dados[i]}   ")
        }
        println("")
    }
}