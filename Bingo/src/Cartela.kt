import kotlin.random.Random

class Cartela {
    public class Cartela(var nome: String) {

        private var numerosDaCartela = arrayOfNulls<Int>(25)

        public fun gerarNumerosDaCartela(): Array<Int?> {
            for (indice in 0..24){
                numerosDaCartela[indice] = Random.nextInt(1,100)
            }
            return numerosDaCartela
        }

        public fun getJogador(): String{
            return nome
        }

        public fun getNumeros(): Array<Int?>{
            return numerosDaCartela
        }

        public fun contemNumero(numero: Int): Boolean{
            for(i in 0..24){
                if(numero == numerosDaCartela[i]){
                    return true
                }
            }
            return false
        }

        public fun imprimir(): String {
            var cart: String = "Cartela: "
            for (i in 0..24){

                cart += numerosDaCartela[i]

                if (i != 0 && ((i+1)%5) == 0){
                    cart += " | "
                }

                if (i != 24 && ((i+1)%5) != 0){
                    cart += ", "
                }
            }
            println(cart)
            return cart
        }
    }
}