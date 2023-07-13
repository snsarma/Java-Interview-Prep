package javatechie.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,7,8,1,5,9);

        int sum = integerList.stream().mapToInt(i-> i).sum();
        System.out.println("Sum :"+sum);

        int anotherSum = integerList.stream().reduce(0,(a,b)->a+b);
        System.out.println("anotherSum :"+anotherSum);
    }

}
