
    fun operar(valor1: Int, valor2: Int, fn: (Int, Int) -> Int): Int {
        return fn(valor1, valor2)
    }

    fun suma(v1: Int, v2: Int) = v1 + v2

    fun resta(v1: Int, v2: Int) = v1 - v2


    fun main(args: Array<String>) {
        val resultado = operar(1, 2, ::suma)

        println("Suma es $resultado")

        val resultadoResta = operar(2, 1, ::resta)
        println("Resta es $resultadoResta")
    }