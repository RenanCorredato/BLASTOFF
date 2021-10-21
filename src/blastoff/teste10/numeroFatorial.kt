package blastoff.teste10

//10 - Faça um algoritmo que receba um número e retorne o Fatorial desse número

fun main() {
    val numero = 10
    var fatorial: Long = 1
    for (i in 1..numero) {
        fatorial *= i.toLong()
    }
    println("Fatorial de $numero = $fatorial")
}
