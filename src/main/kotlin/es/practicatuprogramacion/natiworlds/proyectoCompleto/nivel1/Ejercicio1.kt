package es.practicatuprogramacion.natiworlds.detectarErrores.nivel1

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.proyectoCompleto.nivel1.Carrito
import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.proyectoCompleto.nivel1.Producto


fun main() {
    val carrito = Carrito()
    carrito.agregarProducto(Producto("Manzana", 1.2))
    carrito.agregarProducto(Producto("Pan", 1.0))
    println("Total: ${carrito.total()}")
}