class Analyst
    (
    name: String,
    cpf: String,
    salary: Double
    ) : Employee(
        name = name,
        cpf = cpf,
        salary = salary
    ) {
    override val bonus: Double
        get() {
            return super.bonus + salary * 0.1
        }

}