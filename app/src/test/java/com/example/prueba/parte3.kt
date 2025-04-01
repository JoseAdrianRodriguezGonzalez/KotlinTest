package com.example.prueba

//Precio de boleto
fun main(){
    val child=5//15 usd
    val adult=28//25
    val senior=87//20
    val isMonday=true
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child,isMonday)}")
    println("The movie ticket price for a person aged $child is \$${ticketPrice(adult,isMonday)}")
    println("The movie ticket price for a person aged $child is \$${ticketPrice(senior,isMonday)}")
    println("The ovie ticket price for a person aged $child is \$${ticketPrice(senior,!isMonday)}")

}
fun ticketPrice(age:Int,monday:Boolean):Int{
    if(age<13 &&monday==true)
        return 15
    else if(age<61 &&monday==true)
        return 25
    else if(age<100 &&monday==true)
        return 20;
    else
        return -1
}