/*
Conversor de temperatura
Existem três padrões principais de temperatura usados no mundo: Celsius, Fahrenheit e Kelvin.

No código inicial fornecido no snippet abaixo, escreva um programa que converta uma temperatura de um padrão a outro usando estas fórmulas:

Celsius para Fahrenheit: °F = 9/5 (°C) + 32
Kelvin para Celsius: °C = K - 273,15
Fahrenheit para Kelvin: K = 5/9 (°F - 32) + 273,15
O método String.format("%.2f", /* measurement */ ) é usado para converter um número em um tipo String com duas casas decimais.
*/

fun main() {    
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

//OUTPUT:
//27.0 degrees Celsius is 80.60 degrees Fahrenheit.
//350.0 degrees Kelvin is 76.85 degrees Celsius.
//10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
