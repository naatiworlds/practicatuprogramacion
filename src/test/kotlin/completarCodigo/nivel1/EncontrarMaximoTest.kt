package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1


import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.encontrarMaximo
import kotlin.test.Test
import kotlin.test.assertEquals

class EncontrarMaximoTest {
    @Test
    fun testEncontrarMaximo() {
        assertEquals(4, encontrarMaximo(listOf(1, 2, 3, 4)))
        assertEquals(-1, encontrarMaximo(listOf(-1, -2, -3, -4)))
    }
}
