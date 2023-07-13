package pkg.string;

public class StringExample {
    public static void main(String[] args) {

        String regularString = "Hello"+"World";
        regularString.concat("And  GoodBye"); // doesn't get conctenated , immutable
        StringBuilder builder = new StringBuilder("Hello"+"World");
        builder.append("And  GoodBye"); // gets appended , mutable

        StringExample stringExample = new StringExample();
        stringExample.printInformation(regularString);
        stringExample.printInformation(builder);
    }

    public void printInformation(String string){
        System.out.println("String ="+string);
        System.out.println("Length ="+string.length());
    }

    public void printInformation(StringBuilder builder){
        System.out.println("builder ="+builder);
        System.out.println("Length ="+builder.length());
    }
}
