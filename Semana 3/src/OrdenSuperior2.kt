class Humano(val nombre: String, val edad: Int) {
    fun esMayorEdad(fn: (Int) -> Boolean): Boolean {
        return fn(edad)
    }
}

fun mayorEstadosUnidos(edad: Int): Boolean {
    return edad > 21
}

fun mayorParaguay(edad: Int): Boolean {
    return edad >= 18
}

fun main(args: Array<String>) {
    val personaJuan = Humano("Juan", 18)

    // Como saber si Juan es mayor en Estados Unidos
    if(personaJuan.esMayorEdad(::mayorEstadosUnidos)){
        println("Juan es mayor de edad en USA")
    } else {
        println("Juan no es mayor de edad en USA")
    }

    // Como saber si Juan es mayor en Paraguay
    if (personaJuan.esMayorEdad(::mayorParaguay)) {
        println("Juan es mayor de edad en Paraguay")
    } else {
        println("Juan no es mayor de edad en Paraguay")
    }
}