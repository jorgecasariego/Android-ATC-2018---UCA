fun main(args: Array<String>) {
    // Listas Inmutables
    val diasSemana: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")

    // Obtener el tamaño de la lista
    println("El tamaño de la lista es ${diasSemana.size}")

    // Acceder a la posición 4 de la lista
    println("La posición 4 de la lista tiene el valor ${diasSemana.get(4)}")

    // Como acceder al primer valor de la lista
    println("El primer valor de la lista es ${diasSemana.first()}")

    // Como acceder al ultimo valor de la lista
    println("El ultimo valor de la lista es ${diasSemana.last()}")

    println(diasSemana)

    // Imprimir solo los días "Lunes", "Miercoles" y "Viernes"
    val resultadoFiltro = diasSemana.filter { it == "Lunes" || it == "Miercoles" || it == "Viernes"}
    println("Valores luego de filtrar: $resultadoFiltro")

    /*
        Del siguiente listado de ciudades filtrar:
        1. Los que tengan menos de 15 letras
        2. Luego ordenar por orden alfabetico ascendente
        3. Convertir el resultado a Mayusculas
        4. Imprimir

            [Asunción, Ciudad del Este, Encarnación, Saltos del Guaira,
            Concepción, Pedro Juan Caballero, Pozo Colorado, Antequera]
     */
    val ciudades: List<String> = listOf("Asunción", "Ciudad del Este", "Encarnación", "Saltos del Guaira",
            "Concepción", "Pedro Juan Caballero", "Pozo Colorado", "Antequera")

    ciudades
            .filter {it.length < 15}
            .sortedByDescending { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    

}








