package com.example.prueba

//ejercicio 1
fun main(){
    val morningNotification=52
    val eveningNotificacion=134
    printNotificationSummary(morningNotification)
    //printNotificationSummary(eveningNotificacion)
}
fun printNotificationSummary(numberOfMessages:Int){
    if(numberOfMessages<100){
        print("You have $numberOfMessages\n")
    }else{
        print("Your phone is blowing up! You have 99+ notifications.")
    }

}