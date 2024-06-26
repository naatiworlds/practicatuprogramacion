package es.practicatuprogramacion.natiworlds.poo.nivel1

class Rectangulo(val largo: Double, val ancho: Double) {
    fun area(): Double {
        // Implementa el método para que calcule y retorne el área del rectángulo
        return 0.0
    }
}

fun main() {
    val rectangulo = Rectangulo(4.0, 5.0)
    println("Área: ${rectangulo.area()}")
}
