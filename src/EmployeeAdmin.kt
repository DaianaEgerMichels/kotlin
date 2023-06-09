abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    protected val password: Int
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Authenticate{

    override fun authenticate(password: Int): Boolean {
        if(this.password === password) {
            return true
        }
        return false
    }
}