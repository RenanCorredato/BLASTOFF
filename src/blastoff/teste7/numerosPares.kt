package blastoff.teste7

//7 - Dada uma lista de números A[1,2,3,…], faça um algoritmo que retorne uma lista somente
//com os números pares.

fun main() {
    val numbersLista = (0..20).toList()
    val filtarLista = numbersLista.filter {  x -> x % 2 == 0 }

        println("Lista original  : ${numbersLista}")
        println("Listra filtrada : ${filtarLista}")

}






