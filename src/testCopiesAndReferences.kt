fun testCopiesAndReferences() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val accountJoao = SavingsAccount("João", 1002)
    accountJoao.holder = "João"
    var accountMaria = CheckingAccount("Maria", 1003)
    accountMaria.holder = "Maria"
    accountJoao.holder = "João"

    println("titular conta joao: ${accountJoao.holder}")
    println("titular conta maria: ${accountMaria.holder}")

    println(accountJoao)
    println(accountMaria)
}