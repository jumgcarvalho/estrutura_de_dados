package bubbleSort

class BubbleSort(private var dados: Array<Int>): Ordenavel {

    private fun trocar(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    override fun ordenar() {
        for (i in 0 until dados.size-1) {
            for (j in 0 until dados.size - i - 1) {
                if (dados[j] > dados[j+1]) {
                    trocar(j, j+1)
                }
            }
        }
    }

    override fun print() {
        for (i in 0 until dados.size) {
            print("${dados[i]}   ")
        }
        println("")
    }
}