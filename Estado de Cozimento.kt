/*
Usando a versão do koltin: 1.7.10

Desafio condicional

programa que identifica se a carne está bem ou mal passada pela temperatura em digitada pelo usuario

temperatura °C - Estado de cozimento

< 48°C - Cozinhar por mais tempo
= 48°C - Selada
= 54°C - Ao ponto para mal passada
= 60°C - Ao ponto
= 65°C - Ao ponto para bem passada
= 71°C - Bem passada
> 75°C - Queimou
*/

import java.util.Scanner

fun main() {
    println("Digite a temperatura em °C da carne:" )
    var temp: Int = readln().toInt()

    when(temp){
        in 0..47  -> print("Cozinhar por mais tempo")
        in 48..53 -> print("Selada")
        in 54..59 -> print("Ao ponto para mal passada")
        in 60..64 -> print("Ao ponto")
        in 65..70 -> print("Ao ponto para bem passada")
        in 71..74 -> print("Bem passada")
        else -> print("Queimou")
    }
}
