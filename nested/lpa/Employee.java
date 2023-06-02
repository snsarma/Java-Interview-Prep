package nested.lpa;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }


        @Override
        public int compare(Employee o1, Employee o2) {
            if(this.sortType.equalsIgnoreCase("yearStarted")){
                return (o1.yearStarted - o2.yearStarted);
            }
            return (o1.name.compareTo(o2.name));

        }
    } // This way private members can be accessed , advantage of static nested class
      // Getter method is prevented through this
    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId,name,yearStarted);
    }
}
