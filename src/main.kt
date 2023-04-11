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
    println("bonus ${employee1.bonus}")

    val employee2 = Manager(
        name = "Carol Jenks",
        cpf = "111.222.333-44",
        salary = 4000.0,
        password = 12345
    )

    println("name ${employee2.name}")
    println("cpf ${employee2.cpf}")
    println("salary ${employee2.salary}")
    println("bonus ${employee2.bonus}")

    if (employee2.authenticate(12345)){
        println("Employee authenticated")
    } else {
        println("Error authenticating")
    }

    val employee3 = Director(
        name = "Cecilia Benner",
        cpf = "111.222.333-44",
        salary = 8000.0,
        password = 123456,
        plr = 2000.00
    )

    println("name ${employee3.name}")
    println("cpf ${employee3.cpf}")
    println("salary ${employee3.salary}")
    println("bonus ${employee3.bonus}")

    if (employee3.authenticate(123456)){
        println("Employee authenticated")
    } else {
        println("Error authenticating")
    }

    val calculator = BonusCalculator()
    calculator.registry(employee1)
    calculator.registry(employee2)
    calculator.registry(employee3)

    println(" Total bonus ${calculator.total}")
}
