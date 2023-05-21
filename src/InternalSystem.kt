class InternalSystem {

    fun enter(admin: EmployeeAdmin, password: Int) {
        if(admin.authenticate(password)) {
            println("Welcome, Bytebank :)")
        } else {
            println("Not authenticated :/")
        }
    }
}