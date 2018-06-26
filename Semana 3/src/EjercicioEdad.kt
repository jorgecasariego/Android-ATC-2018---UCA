import kotlin.math.max

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var mayorEdad = 0
    var nombreMayor = ""
    for (persona in people) {
        if(persona.age > mayorEdad) {
            mayorEdad = persona.age
            nombreMayor = persona.name
        }
    }

    println("La persona de mayor edad es $nombreMayor")
}



fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("John", 31))

    findTheOldest(people)
}