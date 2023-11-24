import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        ArrayEmployees arrayEmployees = new ArrayEmployees();

        for (int i = 1; i < 10; i++) {
            employees.add(new Freelancer("Freel_" + i, i * 120));
            employees.add(new Worker("Work_" + i, i * 100));
            arrayEmployees.add(new Freelancer("Freel_Arr" + i, i * 130));
            arrayEmployees.add(new Worker("Work_Arr" + i, i * 110));
        }

        Collections.sort(employees);

        employees.forEach(System.out::println);

        arrayEmployees.forEach(System.out::println);

    }
}