package blastoff.teste3

//3 - Dados três números (a, b, c), faça um algoritmo para mostrar o menor número

fun main() {
    mostrarMenorNumero(100, 55, 18)
}

fun mostrarMenorNumero(a: Int, b: Int, c: Int) {

    val lista = listOf(a, b, c).minOrNull()
    println("Menor número da lista é, $lista")
}
