package es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.proyectoCompleto.nivel1

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.detectarErrores.nivel1.Producto

class Carrito {
    private val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun total(): Double {
        return productos.sumOf { it.precio }
    }
}