package es.practicatuprogramacion.natiworlds.poo.nivel1

abstract class Animal {
    abstract fun hacerSonido(): String
}

class Perro : Animal() {
    override fun hacerSonido(): String {
        // Implementa el método para que retorne "Guau"
        return ""
    }
}

class Gato : Animal() {
    override fun hacerSonido(): String {
        // Implementa el método para que retorne "Miau"
        return ""
    }
}

fun main() {
    val perro = Perro()
    val gato = Gato()
    println("El perro dice: ${perro.hacerSonido()}")
    println("El gato dice: ${gato.hacerSonido()}")
}


