package com.example.fundamentoskotlin.reto1

class reto1 {
}
fun main(){
    val noti = (1..150).random()

    if (noti < 100){
        print("Tienes $noti NOTIFICACIONES!")

    }else if(noti > 100){
        print("TIENES +99 NOTIFICACIONES")

    }else if(noti < 150){
        print("NO TIENES MENSAJES DISPONIBLES")
    }
}