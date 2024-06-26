package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1


import es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.multiplicar
import kotlin.test.Test
import kotlin.test.assertEquals

class MultiplicarTest {
    @Test
    fun testMultiplicar() {
        assertEquals(6, multiplicar(2, 3))
        assertEquals(0, multiplicar(0, 5))
    }
}
