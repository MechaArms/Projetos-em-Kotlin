/*
9. Pedômetro

O pedômetro é um dispositivo eletrônico que conta o número de passos. Atualmente, quase todos os smartphones, smartwatches e equipamentos de ginástica vêm com pedômetros integrados. O app de saúde e fitness usa pedômetros integrados para calcular esse número. Essa função calcula o número de calorias que o usuário queima com base nos passos dados.

	* Você consegue renomear as funções, parâmetros de funções e variáveis neste programa com base nas práticas recomendadas?

	fun main() {
		val Steps = 4000
		val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
		println("Walking $Steps steps burns $caloriesBurned calories")
	}
	
	fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
		val CaloriesBURNEDforEachStep = 0.04
		val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
		return TotalCALORIESburned
	}
*/

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
