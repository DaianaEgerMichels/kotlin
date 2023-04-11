class BonusCalculator {
    var total: Double = 0.0
        private set

    fun registry(employee: Employee) {
        this.total += employee.bonus
    }
    fun registry(director: Director) {
        this.total += director.bonus
    }
    fun registry(manager: Manager) {
        this.total += manager.bonus
    }
}