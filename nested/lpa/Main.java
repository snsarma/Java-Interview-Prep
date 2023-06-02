package nested.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(new Employee(1, "Sam", 1913),
                new Employee(23, "John", 1965),
                new Employee(123, "Tom", 2006)));
//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        employees.sort(new Employee.EmployeeComparator<>("yearStarted")); // Accessing static nested class

        for (Employee employee : employees) {
            System.out.println("employee:" + employee);
        }

        System.out.println("----- Store Employees ---------");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(new StoreEmployee(12, "Susan", 1965, "Piscataway"),
                new StoreEmployee(13, "Emma", 1915, "Edison"),
                new StoreEmployee(15, "Ryan", 1925, "Bedminster")));

        var comparator = new StoreEmployee().new StoreEmployeeComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee storeEmployee : storeEmployees) {
            System.out.println("storeEmployee :" + storeEmployee);
        }
    }
}
