open class Persona(val nombre: String, val edad: Int) {
    open fun imprimirDatosPersonales() {
        print("Nombre: $nombre Edad: $edad ")
    }
}

class Empleado(nombre: String, edad: Int, val sueldo: Double): Persona(nombre, edad) {

    override fun imprimirDatosPersonales() {
        super.imprimirDatosPersonales()
        print(" Sueldo: $sueldo")
        println()
    }

    fun pagaImpuestos() {
        if (sueldo > 10000000) {
            println("$nombre debe pagar impuestos.")
        } else {
            println("El empleado $nombre no debe pagar impuestos.")
        }
    }
}

fun main(args: Array<String>) {
    val persona = Persona("Jorge", 20)

    println(persona.imprimirDatosPersonales())

    val empleado = Empleado("Adriana", 23, 10000000.0)

    println(empleado.imprimirDatosPersonales())
}