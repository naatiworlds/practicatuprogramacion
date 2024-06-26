package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.contarVocales
import kotlin.test.Test
import kotlin.test.assertEquals

class ContarVocalesTest {
    @Test
    fun testContarVocales() {
        assertEquals(2, contarVocales("Hola"))
        assertEquals(4, contarVocales("Mundo"))
    }
}
