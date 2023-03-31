fun testCopiesAndReferences() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val accountJoao = Account("João", 1002)
    accountJoao.titular = "João"
    var accountMaria = Account("Maria", 1003)
    accountMaria.titular = "Maria"
    accountJoao.titular = "João"

    println("titular conta joao: ${accountJoao.titular}")
    println("titular conta maria: ${accountMaria.titular}")

    println(accountJoao)
    println(accountMaria)
}