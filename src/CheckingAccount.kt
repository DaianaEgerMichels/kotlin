class CheckingAccount(
    holder: String,
    number: Int
) : Account(
    holder = holder,
    number = number
) {
    override fun checkout(value: Double) {
        val valueWithFee = value + 0.1
        super.checkout(valueWithFee)
    }
}