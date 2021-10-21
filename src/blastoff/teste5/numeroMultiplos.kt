package blastoff.teste5

//5 - Faça um algoritmo para apresentar se dois números são múltiplos

fun main() {
    numerosMultiplos()
}

fun numerosMultiplos() {
    val numList =  1..20
    val numMul7= numList.map { it *7 }
    val numeMul5 = numList.map { it * 5 }

    numMul7.forEach { n -> println("${n/7} * 7 = $n") };
    println("************************//****************")
    numeMul5.forEach { n -> println("${n/5} * 5 = $n") };
}

