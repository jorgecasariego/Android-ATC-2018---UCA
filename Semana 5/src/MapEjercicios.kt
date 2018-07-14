fun main(args: Array<String>) {
    val paises: Map<String, Int> = mapOf(
            Pair("Paraguay", 7000000),
            Pair("Argentina", 40000000),
            Pair("Brasil", 20000000)
    )

    val tenistas: Map<String, Int> = mapOf(
            "Nadal" to 30,
            "Federer" to 36,
            "Sharapova" to 27
    )

    println("Paises")
    println(paises)

    // Imprimir por clave y valor
    for ((clave, valor) in paises) {
        println("Clave $clave y valor $valor")
    }

    // Imprimir la cantidad de paises de la colección
    println("La cantidad de paises de la colección es ${paises.size}")

    // Imprimir la cantidad de habitantes de Paraguay
    println("La cantidad de habitantes de Paraguay es ${paises["Paraguay"]}")

    // Ejercicio: ver la cantidad de habitantes de todos los paises de la coleccion
    var sumaHabitantes = 0
    paises.forEach { sumaHabitantes += it.value }
    println("La cantidad de habitantes del Mercosur es $sumaHabitantes")


}