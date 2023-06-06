fun testAdmin () {
    val manager = Manager(
        name = "Simas",
        cpf = "123.321.213-31",
        salary = 2500.0,
        password = 1234
    )

    val director = Director(
        name = "Haylee",
        cpf = "789.987.879-89",
        salary = 4300.0,
        password = 45689,
        plr = 1000.0
    )

    val client = Client (
        name = "Dexter",
        cpf = "456.214.441-36",
        password = 58967
    )

    val system = InternalSystem()
    system.enter(manager, 1234)
    system.enter(director, 45689)
    system.enter(client, 58967)
}