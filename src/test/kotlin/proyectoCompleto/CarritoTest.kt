package com.tuUsuario.proyectoCompleto.nivel1.proyectoCompleto

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.proyectoCompleto.nivel1.Carrito
import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.proyectoCompleto.nivel1.Producto
import kotlin.test.Test
import kotlin.test.assertEquals

class CarritoTest {
    @Test
    fun testTotal() {
        val carrito = Carrito()
        carrito.agregarProducto(Producto("Manzana", 1.2))
        carrito.agregarProducto(Producto("Pan", 1.0))
        assertEquals(2.2, carrito.total())
    }
}
