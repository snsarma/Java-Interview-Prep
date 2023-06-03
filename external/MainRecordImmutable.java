package external;

import immutable.PersonImmutable;

public class MainRecordImmutable {
    public static void main(String[] args) {
        PersonImmutable jane = new PersonImmutable("jane","11/20/1995");
        PersonImmutable jim = new PersonImmutable("jim","11/20/1985");
        PersonImmutable joe = new PersonImmutable("joe","11/20/1975");

        PersonImmutable [] johnKids = {jane,jim,joe};
        PersonImmutable john = new PersonImmutable("john","11/20/1950",johnKids);

        PersonImmutable [] kids = john.getKids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Anna","11/10/1990");


//        System.out.println(john);
        PersonImmutable johnCopy = new PersonImmutable("john","11/20/1950");
        System.out.println("-------John Copy---------");
        System.out.println(johnCopy);
        System.out.println("-------John ---------");
        System.out.println(john);


    }
}
