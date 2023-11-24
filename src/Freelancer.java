public class Freelancer extends Employee{

    //region Method
    @Override
    public double calculateMonthlySalary() {
        return  20.8 * 8 * getHourlyRate();
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", ") +
                "hourlyRate=" + hourlyRate +
                '}';
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0){
            throw new RuntimeException("Некорректное число часов.");
        }else {
            this.hourlyRate = hourlyRate;
        }
    }
    //endregion

    //region Constructor
    public Freelancer(String name, int hourlyRate) {
        super(name);
        setHourlyRate(hourlyRate);
    }
    //endregion

    //region Field
    private  double hourlyRate;
    //endregion
}
