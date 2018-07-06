
fun concatenarPalabraNumero(palabra: String, numero: Int): String {

    val concatener: String.(Int) -> String = {this + it}

    return palabra.concatener(numero)
}

fun main(args: Array<String>) {

    // EL resultado debería ser: Rusia2018
    println(concatenarPalabraNumero("Rusia", 2018))
}