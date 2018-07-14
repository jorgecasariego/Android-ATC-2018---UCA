fun main(args: Array<String>) {
    val libros: MutableMap<String, Int> = mutableMapOf(
            "Cien años de soledad" to 90500,
            "Amor en tiempo de colera" to 9900,
            "Yo el supremo" to 1400000,
            "Android Studio" to 300000
    )

    libros.put("La sombra de Fransketeing", 700000)

    imprimirLibros(libros)

    cantidadLibrosMayoresA100mil(libros)
}

fun cantidadLibrosMayoresA100mil(libros: MutableMap<String, Int>) {
    val cantidad = libros.count { it.value > 100000 }
    println("Cantidad de libros: $cantidad")
}

fun imprimirLibros(libros: MutableMap<String, Int>) {
    libros.forEach { clave, valor ->
        println("$clave tiene un precio de $valor")
    }
}
