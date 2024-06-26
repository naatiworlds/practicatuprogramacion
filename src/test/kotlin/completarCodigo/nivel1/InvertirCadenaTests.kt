package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.invertirCadena
import kotlin.test.Test
import kotlin.test.assertEquals

class InvertirCadenaTest {
    @Test
    fun testInvertirCadena() {
        assertEquals("aloH", invertirCadena("Hola"))
        assertEquals("odnuM", invertirCadena("Mundo"))
    }
}
