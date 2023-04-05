class Director(
     name: String,
     cpf: String,
     salary: Double,
     val password: Int,
     val plr: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
){
    override val bonus: Double
        get() {
            return super.bonus + salary + plr
        }

    fun authenticate(password: Int): Boolean {
        if (this.password == password){
            return true
        }
        return false
    }
}