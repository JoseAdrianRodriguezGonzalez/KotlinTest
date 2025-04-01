package com.example.prueba
import com.example.prueba.Song
fun main(){
    val cancion=Song("Bohemian Raphsody","Queen",1975,1300)
    val cancion2=Song("I can't handle change","ROAR",2010,900)
    cancion.printSong()
    cancion2.printSong()
}