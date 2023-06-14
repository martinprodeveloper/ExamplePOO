fun main() {

    // Interfaces

    val tarjeta1 = MasterCard("1234567890")
    tarjeta1.score(51)

    val tarjeta2 = Visa("2233445566")
    tarjeta2.score(51)

}

interface CreditCard {
    val cardNumber: String
    fun score(age: Int)
}

class MasterCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 50) {
            println("Negativo")
        } else {
            println("Positivo")
        }
    }

}

class Visa(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 60) {
            println("Negativo")
        } else {
            println("Positivo")
        }
    }

}