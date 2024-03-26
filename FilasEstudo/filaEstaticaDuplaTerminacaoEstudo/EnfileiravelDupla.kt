package filaEstaticaDuplaTerminacaoEstudo

interface EnfileiravelDupla {
    fun enfileirarInicio(dado: Any?)
    fun enfileirarFim(dado: Any?)
    fun desenfileirarInicio(): Any?
    fun desenfileirarFim(): Any?
    fun peakInicio(): Any?
    fun peakFim(): Any?
    fun updateInicio(dado: Any?)
    fun updateFim(dado: Any?)

    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun printFrontToBack(): String
    fun printBackToFront(): String
}