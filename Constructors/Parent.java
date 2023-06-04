package Constructors;

public class Parent {

    private final String name ;

    private final String dob;

    {
        name = "John Wick";
        dob =   "01/01/2022";
        System.out.println("In Parent Initializer");        // Instance Initializer , Before Constructors are executed

    }

    public Parent() {
        System.out.println("In Parent No-args constructor");
    }

    public Parent(String name, String dob) {
//        this.name = name;
//        this.dob = dob;
        System.out.println("In Parent Constructor");
    }

    public String getName() {
        return name;
    }


    public String getDob() {
        return dob;
    }


    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
