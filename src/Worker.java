public class Worker extends Employee {

    //region Methods
    @Override
    public double calculateMonthlySalary() {
        return getFixedMonthlyPayment();
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        if (fixedMonthlyPayment < 0) {
            throw new RuntimeException("Некорректная зарплата");
        } else {
            this.fixedMonthlyPayment = fixedMonthlyPayment;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", ") +
                "fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }
    //endregion

    //region Constructor
    public Worker(String name,double fixedMonthlyPayment) {
        super(name);
        setFixedMonthlyPayment(fixedMonthlyPayment);
    }
    //endregion

    //region Field
    private double fixedMonthlyPayment;

    //endregion
}
