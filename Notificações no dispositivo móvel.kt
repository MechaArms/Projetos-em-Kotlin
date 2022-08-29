// Lista de exercicios:  https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=pt_br#0

/*
Notificações no dispositivo móvel

Normalmente, o smartphone oferece um resumo das notificações.

No código inicial fornecido no snippet abaixo, escreva um programa que mostra a mensagem de resumo com base no número de notificações recebidas. 
A mensagem precisa incluir:

	* O número exato de notificações quando menor que 100.
	* 99+ como o número de notificações quando houver mais de 100.
*/

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    } else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

//OUTPUT:
//You have 51 notifications.
//Your phone is blowing up! You have 99+ notifications.
