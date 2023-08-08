package com.example.fundamentoskotlin.reto2

import kotlin.random.Random

class Album {
    var canciones = mutableListOf<Int>()
    var tipo_musica = mutableListOf<String>()
    var titulo_cancion = mutableListOf<String>()
    var artista_cancion = mutableListOf<String>()
    var año_publicacion = mutableListOf<Int>()
    var reproducciones = mutableListOf<Int>()

    init {
        val can = readLine()!!.toInt()
        canciones.add(can)
        val tipo_musica1 = readLine()!!
        tipo_musica.add(tipo_musica1)
        val titulo_can = readLine()!!
        titulo_cancion.add(titulo_can)
        val artista_can = readLine()!!
        artista_cancion.add(artista_can)
        val año_can = readLine()!!.toInt()
        año_publicacion.add(año_can)
        val reproducciones_aleatorias = Random.nextInt(1, 5000)
        reproducciones.add(reproducciones_aleatorias)
        val numero = reproducciones_aleatorias
        for (i in reproducciones) {
            if (numero < 1000) {
                println("LA CANCION $titulo_cancion CUENTA CON $reproducciones REPRODUCCIONES Y SE CONSIDERA POCO POPULAR")
            } else {
                println("LA CANCION $titulo_cancion CUENTA CON $reproducciones Y SE CONSIDERA EN TENDENCIA")
            }
        }
    }

    fun impresion(titulo_cancion: String, artista_cancion: String, año_publicacion: Int, reproducciones: Int): String {
        return "$titulo_cancion INTERPRETADA POR $artista_cancion SE LANZO $año_publicacion Y CUENTA CON $reproducciones"
    }
}