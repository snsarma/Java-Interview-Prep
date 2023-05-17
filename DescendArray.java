import java.util.Arrays;
import java.util.Random;

public class DescendArray {

    public static void main(String[] args) {

        int [] unsortedArray = getRandomArray(10);
        System.out.println("---- UnsortedArray---");
        System.out.println(Arrays.toString(unsortedArray));

        int [] sortedArray = Arrays.copyOf(unsortedArray,unsortedArray.length);

        boolean flag = true;
        int temp;
         while(flag){
             flag = false;

             for(int i = 0 ; i < sortedArray.length - 1 ; i++ ){
                 if(sortedArray[i] < sortedArray[i+1]){
                     temp = sortedArray[i];
                     sortedArray[i] = sortedArray[i+1];
                     sortedArray[i+1] = temp;
                     flag = true;
                 }
             }

         }

        System.out.println("--- Sorted Array ----");
        System.out.println(Arrays.toString(sortedArray));

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
