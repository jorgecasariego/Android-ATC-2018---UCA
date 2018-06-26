fun imprimirMultiplos(cadenaNumeros: IntArray, fn: (Int) -> Boolean) {
    println()
    for (numero in cadenaNumeros) {
        if(fn(numero)) {
            print(" $numero")
        }
    }
}

fun main(args: Array<String>) {
    val cadenaNumeros = IntArray(10)

    for(i in cadenaNumeros.indices) {
        cadenaNumeros[i] = (Math.random() * 100).toInt()
    }

    cadenaNumeros.forEach { numero ->
        print(" $numero")
    }

    // Tarea: Imprimir solamente los numeros pares
    imprimirMultiplos(cadenaNumeros, {x -> x % 3 == 0})
}