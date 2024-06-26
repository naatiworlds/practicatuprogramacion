package es.practicatuprogramacion.natiworlds.poo.nivel1


class CuentaBancaria(val titular: String, var saldo: Double) {
    fun depositar(cantidad: Double) {
        // Implementa el método para que deposite la cantidad en el saldo
    }

    fun retirar(cantidad: Double) {
        // Implementa el método para que retire la cantidad del saldo si hay suficiente dinero
    }
}

fun main() {
    val cuenta = CuentaBancaria("Carlos", 1000.0)
    cuenta.depositar(500.0)
    cuenta.retirar(200.0)
    println("Saldo final: ${cuenta.saldo}")
}
