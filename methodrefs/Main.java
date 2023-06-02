package methodrefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld{

    private static int last_id = 1;

    private int id;
    PlainOld(){
        id = last_id++;
        System.out.println("Printing a PlainOldid object:"+id);
    }
}
public class Main {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>(List.of("Anna","Bob","Carl","Dave","Ethan"));
        list.forEach(System.out::println); // Simplest form of method reference
//        calculator((a,b)-> a+b,10,25); // Without method reference
        calculator(Integer::sum,10,25); // Replaced by method reference
        calculator(Double::sum,10.5,25.5);

//        Supplier<PlainOld> reference1 = ()-> new PlainOld();
        Supplier<PlainOld> reference1 = PlainOld::new;

        PlainOld newReference = reference1.get();
        System.out.println("Array------- using static method------");
        PlainOld[] newPojo = seedArray(PlainOld::new,10);
        System.out.println("newPojo:"+Arrays.toString(newPojo));
//        calculator((s1,s2)-> (s1+s2),"Hello","Shravya!");
//        calculator((s1,s2)-> s1.concat(s2),"Hello","Shravya!");// The above is replaced with concat
        calculator(String::concat,"Hello","Shravya!");// The above is replaced with concat , method reference



    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1,value2);
        System.out.println("Result of Operation---------"+result);
    }

    private static PlainOld []  seedArray(Supplier<PlainOld> reference,int count ){

        PlainOld[] array = new PlainOld[10];
        Arrays.setAll(array,i->reference.get());
        return array;
    }
}
