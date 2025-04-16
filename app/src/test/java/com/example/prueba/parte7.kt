package com.example.prueba

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
class FoldablePhone(var isFoldade:Boolean =false,isScreenLightOn: Boolean = false):
    Phone(isScreenLightOn){
        override fun switchOn(){
            isFoldade=false;
            isScreenLightOn=true;
        }
        override fun switchOff() {
            isFoldade=true;
            isScreenLightOn = false
        }
        override fun checkPhoneScreenLight() {
            val phoneScreenLight = if (!isFoldade) "on" else "off"
            println("The phone screen's light is $phoneScreenLight.")
        }
    }
fun main(){
    val f=FoldablePhone();
    f.checkPhoneScreenLight();
}
