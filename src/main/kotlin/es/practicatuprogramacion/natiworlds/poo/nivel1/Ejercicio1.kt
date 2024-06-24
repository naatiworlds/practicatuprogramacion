package es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.detectarErrores.nivel1

class Persona(val nombre: String, var edad: Int)

fun main() {
    val persona = Persona("Juan", 30)
    println("Nombre: ${persona.nombre}, Edad: ${persona.edad}")
}