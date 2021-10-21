package blastoff.teste8

//Faça um algoritmo que receba um número e retorne se o número é primo ou não

fun main() {
    numerosPrimos()

}

fun numerosPrimos() {
    for (i in 2..100) {
        if (ePrimo(i)) println("$i é primo.")
    }
}

fun ePrimo(numero: Int): Boolean {
    for (x in 2 until numero) {
        if (numero % x == 0) return false
    }
    return true
}



