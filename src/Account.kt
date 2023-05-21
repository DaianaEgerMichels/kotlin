abstract class Account(
    var holder: String,
    val number: Int
) {
    var balance = 0.0
        protected set

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    abstract fun checkout(value: Double)

    fun transfer(value: Double, destiny: Account): Boolean {
        if (balance >= value) {
            balance -= value
            destiny.deposit(value)
            return true
        }
        return false
    }
}