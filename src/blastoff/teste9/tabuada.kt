package blastoff.teste9

//9 - Faça um algoritmo que receba um número e retorne a tabuada desse número.

fun main() {
            val numero = 8
            var tabuada: Int

            for (i in 1..10) {
                tabuada = numero * i
                println("tabuada do 8 * $i = $tabuada")
            }
        }