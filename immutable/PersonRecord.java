package immutable;

import java.util.Arrays;

public record PersonRecord(String name, String dob, PersonRecord[] kids) {

    PersonRecord(String name,String dob){
        this(name,dob,new PersonRecord[20]);
    }

    @Override
    public String toString() {
        String kidsString ="n/a";
        if(kids != null){
            String [] names = new String[kids.length];
            Arrays.setAll(names, i->names[i]=kids[i] == null ? " ":kids[i].name);
            kidsString = String.join(",",names);
        }
        return name +"dob =" +dob+ "kids ="+kidsString;
    }
}
