fun main(args: Array<String>) {
    val dias: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles")

    // Agregar los demas dias
    dias.add("Jueves")
    dias.add("Sabado")

    // Imprimir los dias de la semana
    println("Dias: $dias")

    dias.add(4, "Viernes")

    println("Dias: $dias")

    if (dias.none()) {
        println("La lista no tiene valores")
    } else {
        println("La lista tiene ${dias.size} valores")
    }

    val elementos:MutableList<String> = mutableListOf()
    elementos.add("Primero")
    elementos.add("Segundo")

    println("Los elementos de la colección son $elementos")

    //Remover un elemento de la lista
    elementos.removeAt(0)
    println("Los elementos de la colección luego de borrar el indice 0 es $elementos")

    val grupoD:MutableList<String> = mutableListOf("Argentina", "Croacia", "Islandia", "Nigeria")

    // Ejercicio: copiar los equipos a una nueva colección con la posición
    // Ejemplo: ["1: Argentina", "2: Croacia", "3: Islandia", "4: Nigeria"
    val grupoDPosiciones: MutableList<String> = mutableListOf()

    grupoD.forEachIndexed { indice, pais ->
        grupoDPosiciones.add("${indice + 1} : $pais")
    }

    println(grupoDPosiciones)

}