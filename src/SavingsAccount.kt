class SavingsAccount(
    holder: String,
    number: Int
) : TransferableAccount(
    holder = holder,
    number = number
) {
    override fun checkout(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }
}