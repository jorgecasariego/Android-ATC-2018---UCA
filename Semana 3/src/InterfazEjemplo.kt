interface Aeronave {
    fun volar()

    fun definicion() {
        println("Una aeronave es cualquier vehiculo capaz de navegar por los aires")
    }
}

class Helicoptero: Aeronave {
    override fun volar() {
        println("Este es el vuelo de un helicoptero")
    }
}

class Avion: Aeronave {
    override fun volar() {
        println("Este es el vuelo de un avion")
    }
}

fun main(args: Array<String>) {
    val avion = Avion()
    val helicoptero = Helicoptero()

    avion.volar()
    avion.definicion()

    helicoptero.volar()
    helicoptero.definicion()
}