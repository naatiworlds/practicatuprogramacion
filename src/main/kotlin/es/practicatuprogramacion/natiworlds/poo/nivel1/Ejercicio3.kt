package es.practicatuprogramacion.natiworlds.poo.nivel1



class Libro(val titulo: String, val autor: String) {
    fun descripcion(): String {
        // Implementa el método para que retorne "Título: <titulo>, Autor: <autor>"
        return ""
    }
}

fun main() {
    val libro = Libro("1984", "George Orwell")
    println(libro.descripcion())
}
