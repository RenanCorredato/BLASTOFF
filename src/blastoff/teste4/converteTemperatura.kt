package blastoff.teste4

//4 - Faça um algoritmo que converta a temperatura de C para F. Utilize a fórmula c=5/9*(f-32)

fun main() {
    convertaTemperatura(60f)
}

fun convertaTemperatura(fahrenheit: Float) {

    val fahrenheit = fahrenheit * 9.0f / 5.0f + 32.0f
    val conversion = "Convertendo a temperatura de Celsius para Fahrenheit, o resultado é $fahrenheit °F"
    println(conversion)

}



