fun main(args: Array<String>) {
    val conjuntoEnteros: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)

    imprimirValores(conjuntoEnteros)
    //añadir un valor
    conjuntoEnteros.add(10)
    imprimirValores(conjuntoEnteros)

    println("Tamaño: ${conjuntoEnteros.size}")

    if (4 in conjuntoEnteros) {
        println("El 4 pertence al conjunto de enteros")
    } else {
        println("El 4 no pertenece al conjunto de enteros")
    }

    // remover el elemento 4
    conjuntoEnteros.remove(4)
    imprimirValores(conjuntoEnteros)

    val cantidad = conjuntoEnteros.count { it > 10 }
    println("Cantidad es $cantidad")

}

fun imprimirValores(conjuntoEnteros: MutableSet<Int>) {
    for(numero in conjuntoEnteros) {
        print(" $numero")
    }
    println()
}
