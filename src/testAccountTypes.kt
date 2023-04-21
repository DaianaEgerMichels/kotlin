fun testAccountTypes() {
    val checkingAccount = CheckingAccount(
        holder = "Melly",
        number = 1001
    )

    val savingsAccount = SavingsAccount(
        holder = "Oddy",
        number = 1002
    )

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Checking Account: value before checkout -> ${checkingAccount.balance}")
    println("Savings Account: value before checkout -> ${savingsAccount.balance}")

    checkingAccount.checkout(100.0)
    savingsAccount.checkout(100.0)

    println("Checking Account: value after checkout -> ${checkingAccount.balance}")
    println("Savings Account: value after checkout -> ${savingsAccount.balance}")

    checkingAccount.transfer(100.0, savingsAccount)

    println("Checking Account: value after transfer -> ${checkingAccount.balance}")
    println("Savings Account: value after recept transfer -> ${savingsAccount.balance}")

    savingsAccount.transfer(100.0, checkingAccount)

    println("Savings Account: value after transfer -> ${savingsAccount.balance}")
    println("Checking Account: value after recept transfer -> ${checkingAccount.balance}")
}