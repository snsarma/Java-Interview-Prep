import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NewMap {

    public static void main(String[] args) {

        Map<String,Integer> testHashMap = new HashMap<>();

        testHashMap.put("A",2);
        testHashMap.put("B",3);
        testHashMap.put("C",4);
        testHashMap.put("D",5);

        System.out.println("HashMap--------");
        for(Map.Entry m : testHashMap.entrySet()){
            System.out.println(m);
        }

        Map<String,Integer> testLinkedHashMap = new LinkedHashMap<>();

        testLinkedHashMap.put("A",2);
        testLinkedHashMap.put("B",3);
        testLinkedHashMap.put("C",4);
        testLinkedHashMap.put("D",5);

        System.out.println("LinkedHashMap--------");
        for(Map.Entry m : testLinkedHashMap.entrySet()){
            System.out.println(m);
        }

        Map<String,Integer> testTreeHashMap = new TreeMap<>();

        testTreeHashMap.put("A",2);
        testTreeHashMap.put("B",3);
        testTreeHashMap.put("C",4);
        testTreeHashMap.put("D",5);

        System.out.println("TreeMap--------");
        for(Map.Entry m : testTreeHashMap.entrySet()){
            System.out.println(m);
        }
    }
}
