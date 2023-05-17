import java.util.Arrays;

public class ReferenceArray {

    public static void main(String[] args) {
        int [] intArray = new int[6];
        int [] anotherArray = intArray;

        // Both are references to the same array in-memory

        System.out.println("intArray"+ Arrays.toString(intArray));
        System.out.println("anotherArray"+ Arrays.toString(anotherArray));

        anotherArray[0] =1;

        System.out.println("intArray"+ Arrays.toString(intArray));
        System.out.println("anotherArray"+ Arrays.toString(anotherArray));

        modifyArray(intArray);

        System.out.println("intArray"+ Arrays.toString(intArray));
        System.out.println("anotherArray"+ Arrays.toString(anotherArray));

        // 3 references to the same array including myArray


    }

    private static void modifyArray(int [] myArray){ // Pass by reference , Address is being passed
        myArray[1] =5;
        System.out.println("myArray"+Arrays.toString(myArray));
    }
}
