// Desafio com 'Sets' (conjuntos)

/*
Criar um programa que gera 3 listas de acordo com a necessidade abaixo:

Lista 1 = Funcionarios que tem carro e trabalham a noite
Lista 2 = Funcionarios que tem carro e trabalham de dia
Lista 3 = Funcionarios que não tem carro
*/

fun main() {
    val funcionarios = listOf("Ana", "Marcos", "Alice", "Pedro", "Sophia", "Bruno", "Melissa")
    val turno_dia = listOf("Ana", "Marcos", "Alice","Melissa")
    val turno_noite = listOf("Pedro", "Sophia", "Bruno")
    val tem_carro = listOf("Marcos", "Alice", "Bruno", "Melissa")
    
    //println = set
    println(tem_carro intersect turno_noite)	  // tem carro e trabalham a noite
    println(tem_carro intersect turno_dia)		  // tem carro e trabalham de dia
    println(funcionarios subtract tem_carro)  	// remove quem tem carro na lista funcionarios 
}
