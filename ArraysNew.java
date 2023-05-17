import java.util.Arrays;
import java.util.Random;

public class ArraysNew {

    public static void main(String[] args) {

        int [] outputArray ;

        outputArray = getRandomArray(10);

        // Prints the array of integers
        System.out.println("outputArray"+ Arrays.toString(outputArray));

        // Invoke sort method on Array
        Arrays.sort(outputArray);

        //Print out the sorted array
        System.out.println("Sorted Output Array"+Arrays.toString(outputArray));

        // Print out default 0 as the array elements
        int [] secondArray = new int[10];
        System.out.println("secondArray"+Arrays.toString(secondArray));

        Arrays.fill(secondArray,5);
        System.out.println("secondArray"+Arrays.toString(secondArray));

        int [] thirdArray = getRandomArray(10);
        System.out.println("thirdArray"+ Arrays.toString(thirdArray));

        int [] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println("fourthArray"+Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println("thirdArray"+Arrays.toString(thirdArray));
        System.out.println("fourthArray"+Arrays.toString(fourthArray));

        int [] smallArray = Arrays.copyOf(thirdArray,5);
        System.out.println("smallArray"+Arrays.toString(smallArray));
        Arrays.sort(smallArray);
        System.out.println("sorted smallArray"+Arrays.toString(smallArray));

        int [] largeArray = Arrays.copyOf(thirdArray,15); // last 5 to be initialized to 0 default value
        System.out.println("largeArray"+Arrays.toString(largeArray));

        String[] names = {"Andy", "Bob", "Phil", "Steve"};
        Arrays.sort(names); // Sort before binary search
        System.out.println("Sorted Names:"+Arrays.toString(names));
        if(Arrays.binarySearch(names,"Mark")>=0){ // Binary search
            System.out.println("Mark is found!");
        }
        else {
            System.out.println("Mark is not found!");
        }

        // Order and Length matters , not just the content for equality
        if(Arrays.equals(thirdArray,fourthArray)){ // Check contents in both the arrays are equal
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }

        //        for(int i=0 ; i < 10 ; i++){
        //            System.out.println("outputArray"+outputArray[i]);
        //        }

    }

    private static int [] getRandomArray(int len){

        Random random = new Random ();
        int [] randomArray = new int[len];

        for (int i=0 ; i < len ; i++){
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

}
