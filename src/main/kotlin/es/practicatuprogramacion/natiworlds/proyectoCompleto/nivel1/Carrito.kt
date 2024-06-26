package es.practicatuprogramacion.natiworlds.es.practicatuprogramacion.natiworlds.proyectoCompleto.nivel1


class Carrito {
    private val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun total(): Double {
        return productos.sumOf { it.precio }
    }
}