import java.util.*;

public class ArrayEmployees implements Iterable<Employee> {

    //region Methods
    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < employeeCollection.size();
            }

            @Override
            public Employee next() {
                return employeeCollection.get(index++);
            }
        };
    }

    public void add(Employee employee) {
        employeeCollection.add(employee);
    }
    //endregion

    //region Constructor
    public ArrayEmployees() {
        this.employeeCollection = new ArrayList<>();
    }
    //endregion

    //region Field
    List<Employee> employeeCollection;
    //endregion
}
