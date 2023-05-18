import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class NewList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        arrayList.add("Jane");
        arrayList.add("Maya");
        arrayList.add("Carina");
        arrayList.add("Ben");
        arrayList.add("Miranda");


        linkedList.add("Sam");
        linkedList.add("Ted");
        linkedList.add("Brian");
        linkedList.add("Walter");
        linkedList.add("Tucker");

        System.out.println("----ArrayList----");
        for(String name : arrayList){
            System.out.println("Names:"+name);
        }

        System.out.println("----LinkedList----");
        for(String name : linkedList){
            System.out.println("Names:"+name);
        }

    }
}
