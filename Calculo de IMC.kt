/*
Us&&o a versão do koltin: 1.7.10

Desafio if e else

Calculo de IMC - Índice de Massa Corporal

Qual é a sua Altura em cm?
Qual é o seu peso em kg?

IMC = Peso ÷ (Altura)²

menor que 18,5    = MAGREZA
entre 18,5 e 24,9 = NORMAL
entre 25,0 e 29,9 = SOBREPESO
entre 30,0 e 39,9 = OBESIDADE
maior que 40,0    = OBESIDADE GRAVE
*/

import java.util.Scanner
import kotlin.math.pow

fun calculo_IMC(altura: Float, peso: Float): Float{
    val calc_IMC = peso / (altura / 100).pow(2)
    return calc_IMC
}

fun main() {
    println("Digite qual é a sua Altura em cm: ")
    val altura = readln().toFloat()
    println("Digite qual é a seu peso em kg: ")
    val peso = readln().toFloat()
    val imc = calculo_IMC(altura, peso)

    if (imc < 18.5){
        println("MAGREZA")
    }else if (imc in 18.5..24.9){
        println("NORMAL")
    }else if (imc in 25.0..29.9){
        println("SOBREPESO")
    }else if (imc in 30.0..39.9){
        println("OBESIDADE")
    }else{
        println("OBESIDADE GRAVE")
    }
}
