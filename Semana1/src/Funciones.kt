fun main(args: Array<String>) {
    //mostrarNombre()
    val nombre = "Luis"
    mostrarNombreConParametro(nombre)

    val edad = calcularEdad(1982)
    println("Mi edad es $edad")

    val numero1 = 10
    val numero2 = 15
    println("La suma de $numero1 y $numero2 es ${suma(numero1, numero2)}")

    val valor1 = "Hola"
    val valor2 = "Mundo"
    println(concatenar(valor1, valor2))
}

fun concatenar(valor1: String, valor2: String) = "$valor1 $valor2"

fun suma(valor1: Int, valor2: Int) = valor1 + valor2

fun calcularEdad(year: Int): Int {
    return 2018 - year
}

fun mostrarNombreConParametro(nombre: String) {
    println("Mi nombre es $nombre")
}

fun mostrarNombre() {
    println("Mi nombre es Pepe")
}