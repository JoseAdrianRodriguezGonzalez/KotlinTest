package com.example.prueba

fun main(){
    val amanda=Person("Amanda",38,"Play tennis",null)
    val atiqah=Person("Atiqah",28,"climb",amanda)
    amanda.showProfile()
    atiqah.showProfile()

}
class Person(val name: String,val age:Int,val hobby:String?,val referrer:Person?){
    fun showProfile(){
        print("Name: $name\nAge:\n $age\n ")
        if(hobby!=null)
            print("Likes to $hobby ")
        if(referrer!=null)
            print("Has a refferer named ${referrer.name} ")
        else
            return
        if(referrer.hobby!=null)
            print("Who likes to ${referrer.hobby} ")
        else
            return
    }
}