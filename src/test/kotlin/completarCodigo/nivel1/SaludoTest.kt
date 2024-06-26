package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1

import es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.saludo
import kotlin.test.Test
import kotlin.test.assertEquals

class SaludoTest {
    @Test
    fun testSaludo() {
        assertEquals("Hola, Juan", saludo("Juan"))
        assertEquals("Hola, Ana", saludo("Ana"))
    }
}
