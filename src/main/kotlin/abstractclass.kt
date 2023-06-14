fun main() {

    // Abstract Class

    val credit = UserInfo()

    println(credit.creditId())
    credit.newCard()

}

abstract class CreditCard2() {
    fun creditId(): String {
        return "1234567890"
    }

    abstract fun newCard()
}

class UserInfo : CreditCard2() {
    fun getInfo(): String {
        return creditId()
    }

    override fun newCard() {
        println("New Card Created!")
    }
}