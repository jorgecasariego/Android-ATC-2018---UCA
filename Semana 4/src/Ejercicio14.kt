// Cargar un array de enteros con los valores 1, 2, 3, 4, 5, 6
fun main(args: Array<String>) {
    val enteros = arrayOf(1, 2, 3, 4, 5, 6)

    enteros.forEach { print("${it * 4} ") }
}