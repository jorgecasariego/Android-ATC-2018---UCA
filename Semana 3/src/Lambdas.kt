fun operacion(valor1: Int, valor2: Int, fn: (Int, Int) -> Int): Int {
    return fn(valor1, valor2)
}

fun main(args: Array<String>) {
    val suma = operacion(2,3, {x, y -> x * y})

    println("La suma es $suma")

    val potencia = operacion(2, 5) {x, y ->
        var valor = 1
        for (i in 1..y) {
            valor *= x
        }

        valor
    }

    println("La potencia es $potencia")

}