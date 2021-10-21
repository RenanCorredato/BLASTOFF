package blastoff.teste1

//1- Dada as idades I, J, K, X, Y. Faça um algoritmo para calcular a média das idades.

fun main() {
    calculaMedia(60, 15, 25, 45, 89)


}

fun calculaMedia(i: Int, j: Int, k: Int, x: Int, y: Int) {

    val i = i
    val j = j
    val k = k
    val x = x
    val y = y

    val soma = i + j + k + x + y

    val resultado = soma / 5

    println("Média da idade é, $resultado anos")

}
