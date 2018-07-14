data class DatosPersonales(val nombre: String, val telefono: Int?)
data class Empleado(val nroEmpleado: Int, val datosPersonales: DatosPersonales)

fun main(args: Array<String>) {
    var empleado1: Empleado =
            Empleado(23, DatosPersonales("Jorge", 981332255))

    var empleado2: Empleado =
            Empleado(43, DatosPersonales("Lili", null))

    // Imprimir Datos Personales
    imprimirDatosEmpleados(empleado1)
    imprimirDatosEmpleados(empleado2)
}

fun imprimirDatosEmpleados(empleado: Empleado) {
    println("Nro. Empleado: ${empleado.nroEmpleado}")
    println("Nombre: ${empleado.datosPersonales.nombre}")


    // Manera Tradicional
//    if (empleado.datosPersonales.telefono != null) {
//        println("Telefono: ${empleado.datosPersonales.telefono}")
//    } else  {
//        println("Empleado sin teléfono")
//    }

    println("Telefono: ${empleado.datosPersonales.telefono ?: "Empleado sin teléfono"}")
}
