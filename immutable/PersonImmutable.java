package immutable;

import java.util.Arrays;

public class PersonImmutable {

    private final String name;
    private final String dob;
    private final PersonImmutable[] kids;

//    public PersonImmutable(String name, String dob, String name1, String dob1) {
//        this.name = name;
//        this.dob = dob;
//    }

    public PersonImmutable(String name, String dob) {
//        this.name = name;
//        this.dob = dob;
////        this.name = name;
//        kids = new PersonImmutable[0];
        this(name,dob,null);
    }

    public PersonImmutable(String name, String dob, PersonImmutable[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids == null ? null : Arrays.copyOf(kids,kids.length);
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public PersonImmutable[] getKids() {
        //return kids;
        return kids == null ? null : Arrays.copyOf(kids,kids.length);
    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setDob(String dob) {
//        this.dob = dob;
//    }

//    public void setKids(PersonImmutable[] kids) {
//        this.kids = kids;
//    }

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
