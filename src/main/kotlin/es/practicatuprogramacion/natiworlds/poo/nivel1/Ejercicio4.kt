package es.practicatuprogramacion.natiworlds.poo.nivel1


class Empleado(val nombre: String, var salario: Double) {
    fun aumentarSalario(porcentaje: Double) {
        // Implementa el método para que aumente el salario en el porcentaje dado
    }
}

fun main() {
    val empleado = Empleado("Ana", 3000.0)
    empleado.aumentarSalario(10.0)
    println("Salario aumentado: ${empleado.salario}")
}
