package dev.streams;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }
    public void addEmployees(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
