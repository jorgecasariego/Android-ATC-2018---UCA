fun main(args: Array<String>) {
    val numeros = listOf(1, 2, 3)

    // todos son distintos de 3
    println(!numeros.all { it == 3 })

    // alguno sea distinto de 3
    println(numeros.any{ it != 3})
}