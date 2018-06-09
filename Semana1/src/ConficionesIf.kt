fun main(args: Array<String>) {
    val edad = 20



    val nombre = "Ana"

    if (nombre == "Ana") {
        println("Ingresado exitosamente")
    } else {
        println("Nombre de usuario no reconocido")
    }

    println("Resultado: ${esMayorEdad(edad)}")
}

fun esMayorEdad(edad: Int) = edad > 18