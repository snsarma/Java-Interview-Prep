package pkg.string;

public class Main {

    public static void main(String[] args) {
        String birthDate = "11/20/1985";
        int startIndex = birthDate.indexOf("1985");
        System.out.println("startIndex:"+startIndex);
        System.out.println("birthYear:"+birthDate.substring(startIndex));
        System.out.println("Month:"+birthDate.substring(0,2));
        String newDate = String.join("/","01","12","2022");
        System.out.println("newDate:"+newDate);
        System.out.println("newDate:"+newDate.replace('/','-'));
        System.out.println("-".repeat(10));
    }
}
