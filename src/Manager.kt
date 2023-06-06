class Manager(
     name: String,
     cpf: String,
     salary: Double,
     password: Int
) : EmployeeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
), Authenticate{
    override val bonus: Double
        get() {
            return salary
        }

}