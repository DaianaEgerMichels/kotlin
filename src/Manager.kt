class Manager(
    val name: String,
    val cpf: String,
    val salary: Double,
    var password: Int
) {
    fun bonus(): Double {
        return salary * 0.2
    }

    fun authenticate(password: Int): Boolean {
        if (this.password == password){
            return true
        }
        return false
    }
}