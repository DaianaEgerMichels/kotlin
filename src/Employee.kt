class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
    val type: Int //0 employee, 1 manager, 2 director
){
    fun bonus(): Double {
        return when (type) {
            0 -> {
                salary * 0.1
            }

            2 -> {
                salary * 0.2
            }

            else -> {
                salary * 0.3
            }
        }
    }
}