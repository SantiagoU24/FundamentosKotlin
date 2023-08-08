package com.example.fundamentoskotlin.reto5
import kotlin.random.Random
class Nequi {
}
fun main(){


    class Nequi {

        val contraseña = 3422

        var nombre: String = ""
        var numero_C: Int = 0
        var clave: Int = 0
        var saldo: MutableList<Int> = mutableListOf(4500)

        init {
            nombre = readLine() ?: ""
            numero_C = readLine()?.toIntOrNull() ?: 0
            clave = readLine()?.toIntOrNull() ?: 0

            if (clave == contraseña) {
                println("Bienvenido $nombre :D")
                println("SALDO DISPONIBLE: $saldo")
            } else {
                println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más ")
            }

            val opc = readLine()?.toIntOrNull() ?: 0

            when (opc) {
                1 -> {
                    val retiro = readLine()?.toIntOrNull() ?: 0
                    if (saldo[0] < 2000) {
                        println("No tienes el dinero disponible para sacar dinero:(")
                    } else {
                        val aleatorio = Random.nextInt(100000, 999999)
                        println("ACERCATE A UNO DE NUESTROS PUNTOS FISICOS CON EL CODIGO $aleatorio")
                    }
                }
                2 -> {
                    val numero_celular = readLine()?.toIntOrNull() ?: 0
                    val valor_enviar = readLine()?.toIntOrNull() ?: 0
                    if (valor_enviar > saldo[0]) {
                        println("NO TIENES SUFICIENTE SALDO PARA REALIZAR ESTE ENVIO:(")
                    } else {
                        println("TRANSFERENCIA EXITOSA! ")
                    }
                }
                3 -> {
                    val valor_recarga = readLine()!!.toInt()
                    val confirmar_recarga = readLine()
                    if (confirmar_recarga == "1") {
                        saldo.add(valor_recarga)
                        println("RECARGA EXITOSA\n SALDO DISPONIBLE $saldo")

                    } else if (opc == 4) {
                        println("GRACIAS POR PREFERIRNOS")
                    } else {
                        println("OPCION INVALIDA INTENTE DE NUEVooooo")
                    }
                }
            }
        }
    }
}
