package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1

import es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.eliminarDuplicados
import kotlin.test.Test
import kotlin.test.assertEquals

class EliminarDuplicadosTest {
    @Test
    fun testEliminarDuplicados() {
        assertEquals(listOf(1, 2, 3, 4), eliminarDuplicados(listOf(1, 2, 2, 3, 3, 4)))
        assertEquals(listOf(1), eliminarDuplicados(listOf(1, 1, 1, 1)))
    }
}
