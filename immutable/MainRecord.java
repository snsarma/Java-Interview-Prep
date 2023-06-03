package immutable;

public class MainRecord {
    public static void main(String[] args) {
        PersonRecord jane = new PersonRecord("jane","11/20/1995");
        PersonRecord jim = new PersonRecord("jim","11/20/1985");
        PersonRecord joe = new PersonRecord("joe","11/20/1975");

        PersonRecord [] johnKids = {jane,jim,joe};
        PersonRecord john = new PersonRecord("john","11/20/1950",johnKids);

        System.out.println(john);
        PersonRecord johnCopy = new PersonRecord("john","11/20/1950");
        System.out.println(johnCopy);

    }
}
