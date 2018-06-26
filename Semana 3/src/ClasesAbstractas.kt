abstract class Operacion(val valor1: Int, val valor2: Int) {
    var resultado: Int = 0

    abstract fun operar()

    fun imprimirResultado() {
        println("El resultado de la operacion es $resultado")
    }
}

class Suma(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 + valor2
    }

}
class Resta(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 - valor2
    }

}

class Multiplicacion(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 * valor2
    }

}

class Division(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 / valor2
    }

}

fun main(args: Array<String>) {
    val suma = Suma(2, 3)
    suma.operar()
    suma.imprimirResultado()

    val resta = Resta(3,2)
    resta.operar()
    resta.imprimirResultado()

    val multiplicacion = Multiplicacion(2,2)
    multiplicacion.operar()
    multiplicacion.imprimirResultado()

    val division = Division(2,2)
    division.operar()
    division.imprimirResultado()

}