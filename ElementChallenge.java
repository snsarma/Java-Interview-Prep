import java.util.Arrays;
import java.util.Scanner;

public class ElementChallenge {
    public static void main(String[] args) {

        int [] integerValues = scanIntegers();
        int min = findMin(integerValues);
        System.out.println("Integer Values");
        System.out.println(Arrays.toString(integerValues));
        System.out.println("Minimum value is:"+min);
    }

    // Method to build the array of Integers
    private static int [] scanIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of Integers separated by comma");
        String input = scanner.nextLine();

        String [] inputs = input.split(",");
        int [] values = new int[inputs.length];

        for(int i =0; i< inputs.length;i++){
            values[i] = Integer.parseInt(inputs[i].trim());
        }

        return values;
    }

    // Method to find the min element

    private static int findMin(int [] array){
        int min = Integer.MAX_VALUE;
        int el;

        for(int i=0; i< array.length;i++){
             el = array[i];
            if(el < min){
                min = el;
            }
        }

        return min;
    }
}
