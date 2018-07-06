// Calcular si un alumno ha pasado la materia o no dependiendo
// de la siguientes notas
// - 0..59   ---> Aplazado
// - 60..79  ---> Bueno
// - 80..89  ---> Muy Bueno
// - 90..100 ---> Excelente!
// Crear una expresión Lambda que al pasarle la nota devuelva un string
fun main(args: Array<String>) {


    val calcularNota = { numero: Int ->
        when(numero) {
            in 0..59 -> "Aplazado"
            in 60..79 -> "Bueno"
            in 80..89 -> "Muy Bueno"
            in 90..100 -> "Muy Bueno"
            else -> "Sobresaliente!!"
        }
    }

    val nota = 75
    println("El resultado de obtener $nota es ${calcularNota(nota)}")
}