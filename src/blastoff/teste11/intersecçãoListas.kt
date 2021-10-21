package blastoff.teste11

//11 - Dada duas lista de números A[1,2,3,4] e B[1,2,5,8], faça um algoritmo que retorne a
//intersecção das listas

fun main() {

    val numeroA = listOf(1,2,3,4)
    val numeroB = listOf(1,2,5,8)

    println(numeroA.union(numeroB))
    println(numeroA.intersect(numeroB))
    println(numeroA.subtract(numeroB))

}