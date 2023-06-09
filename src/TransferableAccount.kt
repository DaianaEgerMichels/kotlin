abstract class TransferableAccount (
    holder: String,
    number: Int
    ) : Account(
    holder = holder,
    number = number
    )
    {
        fun transfer(value: Double, destiny: Account): Boolean {
            if (this.balance >= value) {
                this.balance -= value
                destiny.deposit(value)
                return true
            }
            return false
        }

    }