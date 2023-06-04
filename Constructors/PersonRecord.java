package Constructors;

public record PersonRecord(String name,String dob) {


//    public PersonRecord(String name, String dob) {
//        this.name = name;
//        this.dob = dob;
//    }

    public PersonRecord { // Canonical means implicitly generated
    }

    // Custom is an overloaded constructor
//    must explicitly invoke the canonical constructor as the first statement

}
