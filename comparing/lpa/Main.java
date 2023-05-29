package comparing.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

        Student tim = new Student("Tim");
        Student [] students = {new Student("Jake"),new Student("Ann"),new Student("Zach")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("result ="+tim.compareTo(new Student("Simba")));
        Comparator<Student> studentComparator = new StudentGPAComparator();
       // Arrays.sort(students,studentComparator);//sorted based on gpa
        Arrays.sort(students,studentComparator.reversed());//sorted based on gpa
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2){
        return (s1.gpa+s1.name).compareTo(s2.gpa+s2.name);
    }
}
class Student implements Comparable<Student> {

    private static int LAST_ID = 1000;
    private static Random random = new Random();

    private int id;
    protected double gpa;

    String name;

    Student(String name){
        this.name = name;
        this.id = LAST_ID++;
        this.gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
        return Integer.valueOf(id).compareTo(o.id);
    }
}
