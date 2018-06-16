data class Equipo(val nombre: String, val fundacion: Int, var ubicacion: String)

fun main(args: Array<String>) {
    val equipo1 = Equipo("Argentina", 1905, "Buenos Aires")
    val equipo2 = Equipo("Paraguay", 1906, "Asunción")
//
//    println(equipo1)
//    println(equipo2)
//
//    // Nombre del equipo 1
//    //println("El nombre del equipo 1 es ${equipo1.nombre}")
//
//    equipo1.ubicacion = "Rosario"
//    println(equipo1)
//
//    println(equipo1.toString())
//
//    val equipo2Modificado = equipo2.copy(nombre = "Republica del Paraguay")
//    println(equipo2Modificado)
//
//
//    println("El primer parametro tiene el siguiente valor: ${equipo2Modificado.component1()}")
//    println("El segundo parametro tiene el siguiente valor: ${equipo2Modificado.component2()}")
//    println("El tercer parametro tiene el siguiente valor: ${equipo2Modificado.component3()}")

    // guardar nombre, fundacion y ubicacion en 3 variables distintas
//    val nombre = equipo1.nombre
//    val fundacion = equipo1.fundacion
//    val ubicacion = equipo1.ubicacion

    val(nombreEquipo, f, ubicacionAsociacion) = equipo1

    println("$nombreEquipo - $f - $ubicacionAsociacion")

    val equipos: MutableList<Equipo> = mutableListOf()
    equipos.add(equipo1)
    equipos.add(equipo2)

    println(equipos)
}