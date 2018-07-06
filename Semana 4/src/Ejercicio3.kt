fun main(args: Array<String>) {
    val errores = listOf<String>("403 Forbidden",
            "404 Not found")

    printMessageWithPrefix(errores, "Error:")
}

fun printMessageWithPrefix(errores: List<String>, prefix: String) {
    errores.forEach {error ->
        println("$prefix $error")
    }
}
