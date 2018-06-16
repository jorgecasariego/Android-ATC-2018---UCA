class Car(val brand: String, var model: String = "", val year: Int, var isDriving: Boolean = false) {

    init {
        println("Instancia del auto creado")
        println("Este modelo de auto es mayor a 2016 ${isRecent()}")
    }

    fun isRecent() = year >= 2016


    fun imprimir() {
        println("Marca: ${brand} - Modelo: ${model} - Año: ${year} - Manejando: $isDriving")
    }
}

fun main(args: Array<String>) {
    var auto = Car("Toyota", "Hilux", 2014)

    auto.imprimir()

    if (auto.isRecent()) {
        println("El auto es un nuevo modelo")
    } else {
        println("El auto es un modelo viejo")
    }

    var fiat: Car = Car("Fiat", "Uno", 1999, true)
    fiat.imprimir()

    var mercedes: Car = Car("Mercedes Benz", year = 2019)
    mercedes.imprimir()

}