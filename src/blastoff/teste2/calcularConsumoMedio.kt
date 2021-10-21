package blastoff.teste2

//2- Dada a distância A e o combustível gasto B, faça um algoritmo para calcular o consumo
//médio


fun main() {
    calculaMediaComsbustivel(100.00, 12.00)
}

fun calculaMediaComsbustivel(distancia: Double, combustivel: Double) {

    val dividir = distancia / combustivel
    val resultado = dividir
    val arredondamento = String.format("%.2f", resultado)

    println("Média de $arredondamento KM/L")

}

