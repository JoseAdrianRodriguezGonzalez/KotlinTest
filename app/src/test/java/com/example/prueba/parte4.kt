package com.example.prueba
//F=9/5*C+32
//C=K-273.15
//K=5/9(F-32)+273.15
fun main(){
    printFinal(27.0,"C","F"){9.0/5.0*it+32.0}//
    printFinal(350.0,"K","C"){it-273.15}//Así se pasa una función Lambda como parametro de una función
    printFinal(10.0,"F","K"){5.0/9.0*(it-32.0)+273.15}//

}
fun printFinal(initialMeasurement: Double,initialUnit:String,finalUnit:String,conversionFormula:(Double)->Double){
    val finalMeasurement= String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit")
}