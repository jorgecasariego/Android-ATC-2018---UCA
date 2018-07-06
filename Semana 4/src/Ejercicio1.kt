data class Persona(val name: String, val age: Int)

fun main(args: Array<String>) {
    val personas = listOf<Persona>(
            Persona("Juan", 27),
            Persona("Marta", 34),
            Persona("alex", 33),
            Persona("Andrea", 27))

    val personaMayor = personas.maxBy { it.age }
    println("Persona mayor es ${personaMayor?.name}")

    val personasConA = personas.filter { it.name.startsWith("A") }
    println(personasConA)

    finTheOldest(personas)

    println()
    // Ejercicio 5: Imprimir todas las personas mayores a 30 años
    println("las personas mayores de 30 son ${personas.filter { it.age > 30 }}")

    personas.forEach {
        if (it.age > 30){
            println(it)
        }
    }

    //Ejercicio 6
    println("Cumplen todos: ${personas.all { it.age >= 27 }}")

}

fun finTheOldest(personas: List<Persona>) {
    var mayor = 0
    var personaMayor: Persona? = null

    for(persona in personas) {
        if (persona.age > mayor) {
            mayor = persona.age
            personaMayor = persona
        }
    }

    print("La persona de mayor edad es ${personaMayor?.name} " +
            "y tiene ${personaMayor?.age} años")
}
