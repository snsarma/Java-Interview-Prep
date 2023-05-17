import java.util.*;
public class TestArrays {

    public static void main(String[] args) {
        int [] testIntegerArray = new int[10];

        for(int i = 0; i < testIntegerArray.length; i++ ){
            testIntegerArray[i] = i;
        }

        System.out.println("Elements in the array are :");

        for(int i = 0; i < testIntegerArray.length; i++ ){
            System.out.println("testIntegerArray"+testIntegerArray[i]);
        }

        // Array Initializer

        int [] newIntArray = new int[]{2,4,6,8};

        for(int i = 0; i < newIntArray.length; i++ ){
            System.out.println("newIntArray"+newIntArray[i]);
        }

        // Alt way of array Initialization

        String [] names = {"Andy","Bob", "Phil", "Steve" };

        for (String name: names) {
            System.out.println("name :"+ name);
        }

        // Deafult values of primitives in the absence of an initializer
        int [] defaultInt = new int[5];
        double [] defaultDouble = new double[5];
        String [] defaultString = new String[10];


        for (int loopInt : defaultInt) {
            System.out.println("loopInt" + loopInt);
        }

        for(double loopDouble : defaultDouble){
            System.out.println("loopDouble" + loopDouble);
        }

        for(String loopString : defaultString){
            System.out.println("loopString" + loopString);
        }

        // Arrays.toString
        System.out.println(Arrays.toString(newIntArray));

        Object objectVariable = newIntArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is an instance of type int[]");
        }

        Object [] objectArray = new Object[4];
        objectArray[0] = 1;
        objectArray[1] = 1.25;
        objectArray[2] = "ABC";
        objectArray[3] = newIntArray;


        for(Object object : objectArray){
            System.out.println("object" + object);
        }




    }
}
