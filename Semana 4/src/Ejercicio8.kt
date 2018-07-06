fun main(args: Array<String>) {

    val multiplicarPor100: (Int) -> String = {
        (it*100).toString()
    }

    println(multiplicarPor100(90))
}