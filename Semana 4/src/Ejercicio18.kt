import com.sun.tools.corba.se.idl.constExpr.Plus

fun String.primeraMitad(): String {
    return this.substring(0..this.length/2-1)
}

fun String.segundaMitad(): String {
    return this.substring(this.length/2)
}

fun Plus.imprimir() {
    print(this)
}

fun IntArray.imprimir() {
    // Manera resumida
    //this.forEach { print(" $it") }

    // Manera larga
    print("[")
    for(elemento in this) {
        print(" $elemento")
    }
    print("]")
}

fun main(args: Array<String>) {
    val cadena = "1234567891"

    val primeraMitad = cadena.primeraMitad()
    val segundaMitad = cadena.segundaMitad()

    println(primeraMitad)
    println(segundaMitad)

    val cadenaNumeros = IntArray(10){it}
    cadenaNumeros.imprimir()
}