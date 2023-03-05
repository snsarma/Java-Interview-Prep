import java.lang.String;

public class TestString {

    public static void main(String[] args) {
        String inputString = "I am here!";
        String outputString = "";
        char ch ;

        // Add comment
        for(int i =inputString.length()-1 ; i >=0 ; --i){
            ch= inputString.charAt(i);
            outputString = outputString+ch;
        }
        System.out.println("Reversed String:"+outputString);
    }
}
