/*
Usando a versão do koltin: 1.7.10

Desafio com funções

Criar um programa que calcula a quantidade de tinta necessaria para pintar uma parede.
O usuario deve fornecer as informações: rendimento, altura e largura
o programa deve mostrar a mensagem no final: 'Você necessita de x latas de tinta.'
uma lata rende 5m²
*/

import java.util.Scanner

fun latas_tinta (alt: Double, larg: Double, rend: Double): String{
    var resultado: Double = (alt + larg) / rend
    val resultadoArredondado = String.format("%.2f", resultado)
    return "Você necessita de $resultadoArredondado latas de tinta."
}

fun main() {
    println("Digite qual o rendimento da lata de tinta: ")
    val rend = readln().toDouble()
    println("Digite a Altura da parede: ")
    val alt = readln().toDouble()
    println("Digite a Largura da parede: ")
    val larg = readln().toDouble()
    println(latas_tinta(alt, larg, rend))
}
