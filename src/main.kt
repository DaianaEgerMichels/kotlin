fun main() {
    println("Bem vindo ao Bytebank")
//    testAccountBehaviors()

    val employee1 = Employee(
        name = "Cristal Lockshelf",
        cpf = "111.222.333-44",
        salary = 2000.0
    )

    println("name ${employee1.name}")
    println("cpf ${employee1.cpf}")
    println("salary ${employee1.salary}")
    println("bonus ${employee1.bonus()}")
}
