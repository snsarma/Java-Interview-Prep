package dev.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Sequence of computations
// Set of computational steps chained together
public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList("N40", "N23", "A23", "A45", "B21", "B23", "C45");

        someBingoNumbers.forEach(s -> {
            if (s.startsWith("N")) {
                System.out.println(s);
            }
        });


        someBingoNumbers.stream()
                .map(String::toUpperCase) // Transform the object
                .filter(s -> s.startsWith("N"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioStringStream = Stream.of("N34", "A34", "B56");
        Stream<String> inStringStream = Stream.of("A1", "B2", "C3", "D4", "E5");

        System.out.println("---------------------------");
        Stream<String> concatStream = Stream.concat(ioStringStream, inStringStream);
        // concatStream.forEach(System.out::println); // foreach is terminal stream is closed
        System.out.println("---------------------------");
        System.out.println(concatStream.distinct().peek(System.out::println).count());// peek is intermediate

        Employee john = new Employee("John Smith", "25");
        Employee jack = new Employee("Jack Sully", "35");
        Employee jim = new Employee("Jim Robbins", "45");
        Employee jade = new Employee("Jade Miller", "55");

        Department hr = new Department("Information Tech");
        hr.addEmployees(john);
        hr.addEmployees(jack);
        Department finance = new Department("Finance");
        finance.addEmployees(jim);
        finance.addEmployees(jade);
        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(finance);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())  //List of List
                .forEach(System.out::println);

        System.out.println("---------------------------");
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A")).collect(Collectors.toList());

        for (String sgNumber : sortedGNumbers) {
            System.out.println(sgNumber);
        }

    }
}
