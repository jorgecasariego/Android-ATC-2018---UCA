fun main(args: Array<String>) {
    val respuestas = listOf<String>(
            "200 Ok",
            "418 I'm a teapot",
            "500 Internal Server Error",
            "409 web service error"
    )

    printProblemCount(respuestas)
}
// Errores que comienzan con 4 --> ClientErrors
// Errores que comienzan con 5 --> ServerErrors
fun printProblemCount(respuestas: List<String>) {
    var clientErrors = 0
    var serverErrors = 0

    respuestas.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}
