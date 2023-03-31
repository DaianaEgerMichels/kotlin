public fun testAccountBehaviors() {
    val accountAlex = Account(titular = "Alex", numero = 1000)
    accountAlex.deposita(200.0)

    val accountFran = Account(numero = 1001, titular = "Fran")
    accountFran.deposita(300.0)

    println(accountFran.titular)
    println(accountFran.numero)
    println(accountFran.saldo)

    println(accountAlex.titular)
    println(accountAlex.numero)
    println(accountAlex.saldo)

    println("depositando na conta do Alex")
    accountAlex.deposita(50.0)
    println(accountAlex.saldo)

    println("depositando na conta da Fran")
    accountFran.deposita(70.0)
    println(accountFran.saldo)

    println("sacando na conta do Alex")
    accountAlex.saca(250.0)
    println(accountAlex.saldo)

    println("sacando na conta da Fran")
    accountFran.saca(100.0)
    println(accountFran.saldo)

    println("saque em excesso na conta do Alex")
    accountAlex.saca(100.0)
    println(accountAlex.saldo)

    println("saque em excesso na conta da Fran")
    accountFran.saca(500.0)
    println(accountFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (accountFran.transfere(destino = accountAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(accountAlex.saldo)
    println(accountFran.saldo)
}