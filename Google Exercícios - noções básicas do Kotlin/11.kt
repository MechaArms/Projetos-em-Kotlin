/*
11. Mover o código duplicado para uma função

Este programa mostra a previsão do tempo para diferentes cidades. Ele inclui o nome da cidade, as temperaturas máximas e mínimas do dia e a chance de chuva.


	fun main() {
		println("City: Ankara")
		println("Low temperature: 27, High temperature: 31")
		println("Chance of rain: 82%")
		println()
	
		println("City: Tokyo")
		println("Low temperature: 32, High temperature: 36")
		println("Chance of rain: 10%")
		println()
	
		println("City: Cape Town")
		println("Low temperature: 59, High temperature: 64")
		println("Chance of rain: 2%")
		println()
	
		println("City: Guatemala City")
		println("Low temperature: 50, High temperature: 55")
		println("Chance of rain: 7%")
		println()
	}

Existem muitas semelhanças com o código que mostra o clima de cada cidade. Por exemplo, há frases que são repetidas várias vezes, como "City:" (cidade) e "Low temperature:" (temperatura baixa). Códigos semelhantes e repetidos apresentam risco de erros no programa. Em uma das cidades, você pode ter um erro de digitação ou esquecer um dos detalhes meteorológicos.

	1. É possível atualizar a função main(), chamar a função que você criou para cada cidade e transmitir os detalhes adequados do clima como argumentos?
	2. É possível criar uma função que mostra os detalhes do clima para uma cidade a fim de reduzir a repetição na função main() e fazer o mesmo com as cidades restantes?
*/

fun main() {
    temperature("Ankara", 27, 31, 82)
    temperature("Tokyo", 32, 36, 10)
    temperature("Cape Town",59, 64, 2)
    temperature("Guatemala City",50, 55 ,7)
}

fun temperature(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int){
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
