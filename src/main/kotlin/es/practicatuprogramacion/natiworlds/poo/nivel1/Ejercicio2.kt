package es.practicatuprogramacion.natiworlds.poo.nivel1

class Coche(val marca: String, val modelo: String) {
    fun imprimirDetalles() {
        // Implementa el método para que imprima "Marca: <marca>, Modelo: <modelo>"
    }
}

fun main() {
    val coche = Coche("Toyota", "Corolla")
    coche.imprimirDetalles()
}
