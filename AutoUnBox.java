import java.lang.reflect.Array;
import java.util.*;

public class AutoUnBox {
    public static void main(String[] args) {

        System.out.println("---Call to returnAnInt--");
        System.out.println("i value is :"+returnAnInt(2));
        System.out.println("---Call to returnAnInteger--");
        System.out.println("I value is:"+returnAnInteger(3));
        System.out.println("---Call to getList--");
        //ArrayList<Integer> returnedList = getList(1,2,3,4,5); // Traditional
        var returnedList = getList(1,2,3,4,5); // use of var
        System.out.println("getList value is:"+returnedList);


    }



    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){

        Integer number = i;
        return number;
    }

    private static ArrayList<Integer> getList(int ...varargs){

        ArrayList<Integer> retList = new ArrayList<>();

        for(int i : varargs){
            retList.add(i);
        }

        return retList;

    }
}
