package com.tuUsuario.proyectoCompleto.nivel1.completarCodigo.nivel1

import es.practicatuprogramacion.natiworlds.completarCodigo.nivel1.convertirAMayusculas
import kotlin.test.Test
import kotlin.test.assertEquals

class ConvertirAMayusculasTest {
    @Test
    fun testConvertirAMayusculas() {
        assertEquals("HOLA", convertirAMayusculas("hola"))
        assertEquals("MUNDO", convertirAMayusculas("mundo"))
    }
}
