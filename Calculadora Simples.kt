/*
Usando a versão do koltin: 1.7.10

Calculadora Simples

Crie uma calculadora
*/

import java.util.Scanner

fun main() {
    println("Welcome to our calculator")
    println("Enter the first number:");
    val a = readln().toDouble()
    println("Enter the second number:")
    val b = readln().toDouble()
    println("Choose one of the following operations:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - division")
    val choice = readLine()!!.toInt()
    var result = 0.0
    when (choice) {
        1 -> result = a + b
        2 -> result = a - b
        3 -> result = a * b
        4 -> result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("Result: $result")
    } else {
        println("Invalid choice")
    }
    println("Thank you for using our calculator.")
}

