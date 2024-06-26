package es.practicatuprogramacion.natiworlds.detectarErrores.nivel1

fun esNumeroPrimo(numero: Int): Boolean {
    // Encuentra y corrige el error
    if (numero <= 1) return false
    for (i in 2..numero) {
        if (numero % i == 0) return false
    }
    return true
}
