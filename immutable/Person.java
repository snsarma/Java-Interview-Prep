package immutable;

import java.util.Arrays;

public class Person {

    private String name;
    private String dob;
    private Person [] kids;

    public Person(String name, String dob) {
       this(name,dob,null);
    }

    public Person() {
//        this.name = name;
    }

    public Person(String name, String dob, Person[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public Person[] getKids() {
        return kids;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setDob(String dob) {
//        this.dob = dob;
//    }

    public void setKids(Person[] kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        String kidsString ="n/a";
        if(kids != null){
            String [] names = new String[kids.length];
            Arrays.setAll(names,i->names[i]=kids[i] == null ? " ":kids[i].getName());
            kidsString = String.join(",",names);
        }
        return name +"dob =" +dob+ "kids ="+kidsString;
    }
}
