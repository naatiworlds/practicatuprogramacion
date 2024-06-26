package es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.poo.nivel1

open class Persona(val nombre: String, val edad: Int)

class Estudiante(nombre: String, edad: Int, val grado: String) : Persona(nombre, edad) {
    fun imprimirDetalles() {
        // Implementa el método para que imprima "Nombre: <nombre>, Edad: <edad>, Grado: <grado>"
    }
}

fun main() {
    val estudiante = Estudiante("Pedro", 20, "Segundo año")
    estudiante.imprimirDetalles()
}

