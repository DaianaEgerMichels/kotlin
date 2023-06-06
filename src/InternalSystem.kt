class InternalSystem {

    fun enter(admin: Authenticate, password: Int) {
        if(admin.authenticate(password)) {
            println("Welcome, Bytebank :)")
        } else {
            println("Not authenticated :/")
        }
    }
}