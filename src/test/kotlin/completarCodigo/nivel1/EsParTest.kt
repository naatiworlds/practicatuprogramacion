package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1


import es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.esPar
import kotlin.test.Test
import kotlin.test.assertEquals

class EsParTest {
    @Test
    fun testEsPar() {
        assertEquals(true, esPar(4))
        assertEquals(false, esPar(7))
    }
}
