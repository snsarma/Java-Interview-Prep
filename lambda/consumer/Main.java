package lambda.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Alpha", "Beta", "Chi", "Delta", "Epsilon"));

        for (String s : list) {
            System.out.println("test:" + s);
        }

        System.out.println("-------- Lambda Expression ---------");
        list.forEach((s) -> System.out.println(s)); // Consumer
        System.out.println("-----------------------------------");
        String prefix = "super";
        list.forEach((var myString) -> {
            char myChar = myString.charAt(0);
            System.out.println(prefix + " " + "myChar :" + myChar);
        });

        int result = calculator((a, b) -> a + b, 5, 2);
        System.out.println("Result in Main------" + result);
        var newResult = calculator(
                (String a, String b) -> a.toUpperCase() + " " + b.toUpperCase(),
                "roger", "federer");
        System.out.println("----------------------");
        System.out.println("newResult:" + newResult);

        System.out.println("-----------Co-ordinates-----------");

        var coords = Arrays.asList(new double[]{0.5, 2.5},
                new double[]{1.5, 3.5},
                new double[]{2.4, 5.4});
        coords.forEach((s) -> System.out.println(Arrays.toString(s)));
        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f,lng:%.3f]%n", lat, lng);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);
        System.out.println("-----------------------------");
        coords.forEach(s -> processPoint(s[0], s[1], p1));
        System.out.println("----Predicate----------------");
        list.removeIf(s->s.equalsIgnoreCase("beta")); // makes a call internally to predicate interface
        list.forEach(s-> System.out.println(s));
        list.addAll(List.of("earnest","earn","early"));
        list.forEach(s-> System.out.println(s));
        System.out.println("------------------");
        list.removeIf(s->s.startsWith("ea"));
        list.forEach(s-> System.out.println(s));
        list.replaceAll(s->s.charAt(0)+"-"+s.toUpperCase()); // Invokes Unary Operator Interface
        System.out.println("-----------------");
        System.out.println(list);

        String[] emptyStrings = new String[10];
        Arrays.fill(emptyStrings,"");
        System.out.println("------------------------------------------------");
        System.out.println("Empty Strings:"+Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, (i)->" "+(i+1)+" .");
        System.out.println("----------------------");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, (i)->" "+(i+1)+" ."+ switch(i){ //IntFunction
            case 1-> "ONE";
            case 2-> "TWO";
            case 3-> "THREE";
            case 4-> "FOUR";
            default -> "None";
        });
        System.out.println("----------------------");
        System.out.println(Arrays.toString(emptyStrings));
        String [] names = {"Anna","Bob","Charlie","Dave","Eddie","Frank","George","Hank"};
        String [] randomList = randomlySelectedValues(15,names,()->new Random().nextInt(0, names.length));

        System.out.println("----------------------");
        System.out.println("randomList :"+Arrays.toString(randomList)); // Generates an array of length 15 with values from names array

    }

//    public static <T> T calculator(Operation<T> function, T value1, T value2) {
//
//        T result = function.operate(value1, value2);
//        //System.out.println("------ Result--" + result);
//
//        return result;
//    }// This uses the functional interface built by us

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {

        T result = function.apply(value1, value2); // replaces operate of the previous version
        //System.out.println("------ Result--" + result);

        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> biConsumer) {
        biConsumer.accept(t1, t2);
    }

    public static String [] randomlySelectedValues(int count, String[] values, Supplier<Integer> s){

        String [] selectedValues = new String[count];
        for(int i =0 ; i <count ; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }

}
