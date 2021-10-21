package blastoff.teste14

//14 - Faça um algoritmo que recebe uma palavra e retorne se a palavra é palíndromo.
//(Palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa. Ex: osso,
//Ana e etc).

fun main() {

            val palavra = "ARARA"
            var resultado = ""
            for (x in palavra.length - 1 downTo 0) {
                resultado += palavra[x]
            }
            if (resultado == palavra) {
                println("A palavra $palavra é um PALINDROMO")
            } else {
                println("A palavra $palavra NÃO é um PALINDROMO")
            }
        }




