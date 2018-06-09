fun main(args: Array<String>) {
    // Esta es una variable inmutable
    val nombre: String = "Jorge Casariego"

    // Variable mutable
    var edad: Int = 35

    println(nombre)
    println(edad)

    edad = 36

    println(edad)

    val pi: Float = 3.14F
    var latitud: Double = 25.8976

    // Como concatenar en Java
    println("Mi nombre es " + nombre + " y mi edad es " + edad)

    // Como concatenar en Kotlin
    println("Kotlin:")
    println("Mi nombre es $nombre y mi edad es $edad")
}












