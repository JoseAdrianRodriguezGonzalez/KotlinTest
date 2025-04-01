package com.example.prueba

class Song(
    val titulo:String,
    val artista:String,
    val anio:Int,
    val reproducciones:Int)
{
    val popular:Boolean
        get()=reproducciones>1000
    fun printSong(){
        if(popular)
            print("La canción ${this.titulo} es del artista ${this.artista}, del año ${this.anio}, con las reproducciones ${this.reproducciones}, siendo popular")
        else
            print("La canción ${this.titulo} es del artista ${this.artista}, del año ${this.anio}, con las reproducciones ${this.reproducciones}, no siendo popular")
    }
}