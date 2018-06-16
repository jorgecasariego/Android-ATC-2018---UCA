fun main(args: Array<String>) {

    val diasSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves")

    // Acceder a la primera posición del array
    println("El primer día de la semana es ${diasSemana.get(0)}")

    val variablesMixtas = arrayOf(1, 2, 3, 4, 5)



    diasSemana.forEach { dia ->
        variablesMixtas.forEach {valor ->
            println("valor: $dia y $valor")
        }
    }

    println("El tamaño del array de valores mixtos es ${variablesMixtas.size}")

    println("La posición 4 del array es ${variablesMixtas.get(4)}")

    //Modificar la posición 3 del array de variables mixtas
    //variablesMixtas.set(3, "Nuevo valor")

    println("El nuevo valor de la posición 3 es ${variablesMixtas.get(3)}")


    // Crer un array de solo enteros
    val valoresEnteros = arrayOf<Int>(1, 2, 3, 4)

    // Otra manera de crear un array de enteros
    val otrosValoresEnteros = intArrayOf(5, 6, 7)

//    for (dia in diasSemana) {
//        print(" $dia")
//    }
//
//    println()
//    // For con indice
//    for ((posicion, dia) in diasSemana.withIndex()) {
//        println("El dia $dia se encuentra en la posicion $posicion")
//        if (posicion == 2) {
//            break
//        }
//    }

    diasSemana.forEach {diaSemana ->
        println("Día es $diaSemana")
    }

    diasSemana.forEach {
        println("Día es $it")
    }

}