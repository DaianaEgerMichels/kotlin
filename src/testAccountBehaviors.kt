public fun testAccountBehaviors() {
    val accountAlex = CheckingAccount(holder = "Alex", number = 1000)
    accountAlex.deposit(200.0)

    val accountFran = SavingsAccount(number = 1001, holder = "Fran")
    accountFran.deposit(300.0)

    println(accountFran.holder)
    println(accountFran.number)
    println(accountFran.balance)

    println(accountAlex.holder)
    println(accountAlex.number)
    println(accountAlex.balance)

    println("depositando na conta do Alex")
    accountAlex.deposit(50.0)
    println(accountAlex.balance)

    println("depositando na conta da Fran")
    accountFran.deposit(70.0)
    println(accountFran.balance)

    println("sacando na conta do Alex")
    accountAlex.checkout(250.0)
    println(accountAlex.balance)

    println("sacando na conta da Fran")
    accountFran.checkout(100.0)
    println(accountFran.balance)

    println("saque em excesso na conta do Alex")
    accountAlex.checkout(100.0)
    println(accountAlex.balance)

    println("saque em excesso na conta da Fran")
    accountFran.checkout(500.0)
    println(accountFran.balance)

    println("Transferência da conta da Fran para o Alex")

    if (accountFran.transfer(destiny = accountAlex, value = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(accountAlex.balance)
    println(accountFran.balance)
}