package es.practicatuprogramacion.natiworlds.poo.nivel1

import kotlin.math.PI

class Circulo(val radio: Double) {
    fun area(): Double {
        // Implementa el método para que calcule y retorne el área del círculo
        return 0.0
    }

    fun circunferencia(): Double {
        // Implementa el método para que calcule y retorne la circunferencia del círculo
        return 0.0
    }
}

fun main() {
    val circulo = Circulo(5.0)
    println("Área: ${circulo.area()}")
    println("Circunferencia: ${circulo.circunferencia()}")
}
