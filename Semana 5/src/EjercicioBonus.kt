fun main(args: Array<String>) {
    val valor = "Hola"
    imprimirElementos(valor, "Mundo", "Paraguay", "Rusia")
}

fun imprimirElementos( elemento: String, vararg  palabras: String) {
    println(elemento)

    for(palabra in palabras) {
        print(" $palabra")
    }
}
