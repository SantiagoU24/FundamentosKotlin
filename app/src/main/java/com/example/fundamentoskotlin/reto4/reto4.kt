package com.example.fundamentoskotlin.reto4

class reto4 {
}

fun main(){


    val entradas = mutableListOf("EMPANADAS", "NACHOS", "BUÑUELOS", "ALMEJAS")
    val platosFuertes = mutableListOf("PASTA", "CARNE", "HUEVO")
    val postres = mutableListOf("PAI DE LIMON", "MILHOJA", "BROWNIE")
    val bebidas = mutableListOf("CERVEZA", "LIMONADAS", "JUGOS NATURALES")
    var contador = 0
    var contador1 = 1
    var contador2 = 2
    var contador3 = 3
    val categoria = readLine()!!.toInt()
    val opc = readLine()!!.toInt()
    if (categoria == 2) {
        if (opc == 1) {
            print("DIGITE EL PLATO QUE DESEA AGREGAR: ")
            val agregarPlatos = readLine()!!
            platosFuertes.add(agregarPlatos)
            print("ASIGNELE UN CODIGO AL PLATO CREADO: ")
            val codigo = readLine()!!.toInt()
            platosFuertes.add(codigo.toString())
        } else if (opc == 2) {
            print("QUE MENU DESEA EDITAR: \n 1. PLATOS FUERTES \n 2. ENTRADAS \n 3. POSTRES \n 4. BEBIDAS")
            val editar = readLine()!!.toInt()
            for (i in platosFuertes.indices) {
                print("DIGITE EL NOMBRE DEL PLATO QUE DESEA EDITAR")
                val editarPlatos = readLine()!!
                val agregarPlatos = null
                if (platosFuertes[i] == agregarPlatos) {
                    platosFuertes[i] = editarPlatos
                }
            }
        } else if (opc == 3) {
            print("DIGITE EL NOMBRE DEL PLATO QUE DESEA ELIMINAR: ")
            val productoAEliminar = readLine()!!
            val productoAEliminarMinusculas = productoAEliminar.toLowerCase()
            for (x in 0 until 1) {
                if (platosFuertes[x] == productoAEliminarMinusculas) {
                    platosFuertes.removeAt(x)
                }
            }
        }
    }else if (categoria == 4) {
        if (opc == 1) {
            val agregar_bebida = readLine()!!
            bebidas.add(agregar_bebida)
            val codigo_b = readLine()!!.toInt()
            //bebidas.add(codigo_b)
        } else if (opc == 2) {
            for (i in 0 until bebidas.size) {
                val editar_bebidas = readLine()!!
                if (bebidas[i] == editar_bebidas) {
                    bebidas[i] = editar_bebidas
                }
            }
        } else if (opc == 3) {
            val producto_a_eliminar = readLine()!!
            val producto_a_eliminar_minusculas = producto_a_eliminar.toLowerCase()
            for (x in 0 until bebidas.size) {
                if (bebidas[x] == producto_a_eliminar_minusculas) {
                    bebidas.removeAt(x)
                }
            }
        } else if (opc == 4) {
            println("LAS BEBIDAS SON: $bebidas")
        }
    }

}
