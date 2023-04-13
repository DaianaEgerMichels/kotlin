class BonusCalculator {
    var total: Double = 0.0
        private set

    fun registry(employee: Employee) {
        this.total += employee.bonus
    }
}