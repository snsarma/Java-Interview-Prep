package Constructors;

public class Child {

    private final String name ;

    private final String dob;

    {
        name = "John Wick";         // Instance Initializer , Before Constructors are executed
        dob =   "01/01/2022";
        System.out.println("In Child Initializer");

    }

    public Child() {
        System.out.println("In Child no-args constructor");
    }

    public Child(String name, String dob) {
//        this.name = name;
//        this.dob = dob;
        System.out.println("In Child Constructor");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }


    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
