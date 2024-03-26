package insertionSort

class IsertionSort(private var dados: Array<Int>): Ordenavel {

    private fun trocar(i: Int, j: Int) {
        var temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    override fun ordenar() {
        for (i in 1 until dados.size) {
            var j = i
            while ((j > 0) && dados[j] < dados[j-1]) {
                trocar(j, j-1)
                j--
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