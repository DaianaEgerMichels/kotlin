open class Account(
    var holder: String,
    val number: Int
) {
    var balance = 0.0
        private set

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    open fun checkout(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destiny: Account): Boolean {
        if (balance >= value) {
            balance -= value
            destiny.deposit(value)
            return true
        }
        return false
    }
}