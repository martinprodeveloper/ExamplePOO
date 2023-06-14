fun main() {

    // Constructores - Constructor Principal

    val auto = CarDetail(2023, "Azul", "Sedan")
    println(auto.year)
    println(auto.color)
    println(auto.model)
    auto.encender()

    println()

    val auto2 = CarDetail(2020, "Anaranjado", "Picanto")
    println(auto2.year)
    println(auto2.color)
    println(auto2.model)
    auto2.apagar()

}

class CarDetail(val year: Int, val color: String, val model: String) {

    // Bloque Init

    init {
        val antiguedad = 2023 - year
        println("La antiguedad es de $antiguedad años")
    }

    // Member Functions

    fun encender() {
        println("Engine Start...")
    }

    fun apagar() {
        println("Engine Off...")
    }

}