fun cantidadEnterosMultiplos(cadena: IntArray, fn: (Int) -> Unit) {
    for (elemento in cadena) {
        fn(elemento)
    }
}

fun main(args: Array<String>) {
    var cadenaEnterosAleatorios = IntArray(10) {
        (Math.random() * 100).toInt()
    }

    print("Valores")
    cadenaEnterosAleatorios.forEach { print(" $it") }

    // Imprimir la cantidad de valores que son multiplos de 5
    var cantidad = 0
    cantidadEnterosMultiplos(cadenaEnterosAleatorios){
        if (it % 5 == 0) {
            cantidad++
        }
    }
    

    println("\nLa cantidad de numeros multiplos de 5 es $cantidad")
}