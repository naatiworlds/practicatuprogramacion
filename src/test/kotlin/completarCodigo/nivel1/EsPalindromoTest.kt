package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1


import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.esPalindromo
import kotlin.test.Test
import kotlin.test.assertEquals

class EsPalindromoTest {
    @Test
    fun testEsPalindromo() {
        assertEquals(true, esPalindromo("anilina"))
        assertEquals(false, esPalindromo("mundo"))
    }
}
