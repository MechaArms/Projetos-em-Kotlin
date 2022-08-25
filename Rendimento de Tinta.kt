//Desafio com funções

/*
criar um programa que calcula a quantidade de tinta necessaria para pintar uma parede.
O usuario deve fornecer as informações: rendimento, altura e largura
o programa deve mostrar a mensagem no final: 'Você necessita de x latas de tinta.'
uma lata rende 5m²
*/

fun latas_tinta (alt: Double, larg: Double, rend: Double): String{
    var resultado: Double = (alt + larg) / rend
    val resultadoArredondado = String.format("%.2f", resultado)
    return "Você necessita de $resultadoArredondado latas de tinta."
}

fun main() {
    println("Digite qual o rendimento da lata de tinta: ")
    val alt = readln().toDouble()
    println("Digite a Altura da parede: ")
    val larg = readln().toDouble()
    println("Digite a Largura da parede: ")
    val rend = readln().toDouble()
    println(latas_tinta(alt, larg, rend))
}
// koltin up 1.6v
