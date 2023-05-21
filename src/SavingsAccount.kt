class SavingsAccount(
    holder: String,
    number: Int
) : Account(
    holder = holder,
    number = number
) {
    override fun checkout(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }
}