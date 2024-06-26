package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.sumarLista
import kotlin.test.Test
import kotlin.test.assertEquals

class SumarListaTest {
    @Test
    fun testSumarLista() {
        assertEquals(10, sumarLista(listOf(1, 2, 3, 4)))
        assertEquals(0, sumarLista(listOf()))
    }
}
