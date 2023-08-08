package com.example.fundamentoskotlin.reto3

class reto3 {
}

fun main(){

    val precio_base : Int = 1000
    print("1.DIGITE EL PRECIO QUE DESEA SUBASTAR $:")
    var precio1 = readln()!!.toInt()
    print("2.DIGITE EL PRECIO QUE DESEA SUBASTAR$:")
    var precio2= readln()!!.toInt()
    print("3.DIGITE EL PRECIO QUE DESEA SUBASTAR$:")
    var precio3= readln()!!.toInt()
    print("4.DIGITE EL PRECIO QUE DESEA SUBASTAR$:")
    var precio4 = readln()!!.toInt()

    when(precio_base){}
        if (precio1>precio3 && precio1> precio2 && precio1 > precio_base && precio1>precio4){
        print("LA SUBASTA FUE VENDIDA AL PUJADOR N.1 CON UNA SUBASTA DE $$precio1")
        }else if(precio2>precio3 && precio2> precio1 && precio2 > precio_base && precio2>precio4){
        print("LA SUBASTA FUE VENDIDA AL PUJADOR N.2 CON UNA SUBASTA DE $$precio2")
        }else if(precio3>precio4 && precio3> precio2 && precio3 > precio_base && precio4>precio1){
        print("LA SUBASTA FUE VENDIDA AL PUJADOR N.3 CON UNA SUBASTA DE $$precio3")
        }else if(precio4>precio3 && precio4> precio2 && precio4 > precio_base && precio4>precio1){
        print("LA SUBASTA FUE VENDIDA AL PUJADOR N.4 CON UNA SUBASTA DE $$precio4")
        }else{
        print("LA SUBASTA NO SUPERO EL PRECIO BASEM SE VENDE A LA CASA")
    }



    }
