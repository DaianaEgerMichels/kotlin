class Client(
    val name: String,
    val cpf: String,
    private val password: Int
) : Authenticate{
    override fun authenticate(password: Int): Boolean {
        if(this.password === password) {
            return true
        }
        return false
    }

}