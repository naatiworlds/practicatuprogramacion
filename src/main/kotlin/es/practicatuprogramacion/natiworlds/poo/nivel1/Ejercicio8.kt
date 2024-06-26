package es.practicatuprogramacion.natiworlds.poo.nivel1

class Estudiante(val nombre: String, val calificaciones: List<Int>) {
    fun promedio(): Double {
        // Implementa el método para que calcule y retorne el promedio de las calificaciones
        return 0.0
    }
}

fun main() {
    val estudiante = Estudiante("Luis", listOf(90, 80, 70, 85))
    println("Promedio: ${estudiante.promedio()}")
}
