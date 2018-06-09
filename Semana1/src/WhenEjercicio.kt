fun main(args: Array<String>) {

    println(convertirNumeroLetra(1))
    println(convertirNumeroLetra(10))

    println(trimestre(1))
    semestre(7)
    println("Hola es del tipo ${type("Hola")}")
    println("5 es del tipo ${type(5)}")
    println("3.14F es del tipo ${type(3.14F)}")

}

fun type(any: Any): String {
    when (any) {
        is String -> return "String"
        is Int -> return "Int"
        else -> return "es un tipo no reconocido por el sistema"
    }
}

fun semestre(mes: Int) {
    when (mes) {
        in 1..6 -> println("Primer semestre del año")
        in 7..12 -> println("Segundo semestre del año")
        else -> {
            println("No corresponde a un mes valido")
        }
    }
}

fun trimestre(mes: Int): String {
    when(mes) {
        1,2,3 -> return "Primer Trimestre"
        4,5,6 -> return "Segundo Trimestre"
        7,8,9 -> return "Tercer Trimestre"
        else -> return "Mes no valido"
    }
}

fun convertirNumeroLetra(numero: Int): String {
    when(numero) {
        1 -> return "Uno"
        2 -> return  "Dos"
        3 -> return  "Tres"
        4 -> return  "Cuatro"
        5 -> return  "Cinco"
        6 -> return  "Seis"
        7 -> return  "Siete"
        8 -> return  "Ocho"
        9 -> return  "Nueva"
        else -> {
            return "Numero no valido"
        }
    }
}