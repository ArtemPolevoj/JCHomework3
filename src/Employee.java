public abstract class Employee implements Comparable<Employee>{

    //region Methods

    public abstract double calculateMonthlySalary();

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Некорректное имя человека.");
        } else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        String[] temp = getClass().toString().split(" ");
        String srtClass = temp[temp.length - 1];
        return srtClass + " {" +
                "name='" + getName() +
                '}';
    }

    //endregion

    //region Constructor
    public Employee(String name) {
        setName(name);
    }
    //endregion

    //region Field
    private String name;
    //endregion
}
