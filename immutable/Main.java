package immutable;

public class Main {
    public static void main(String[] args) {
//        Person jane = new Person();
////        jane.setName("Jane");
//        Person tim = new Person();
////        tim.setName("Tim");
//        Person doe = new Person();
////        doe.setName("Doe");
//        Person john = new Person();
////        john.setName("John");
////        john.setDob("11/20/1995");
//        john.setKids(new Person[]{jane,tim,doe});
//        System.out.println(john);
        Person jane = new Person("jane","11/20/1995");
        Person jim = new Person("jim","11/20/1985");
        Person joe = new Person("joe","11/20/1975");

        Person [] johnKids = {jane,jim,joe};
        Person john = new Person("john","11/20/1950",johnKids);

        System.out.println(john);


    }
}
