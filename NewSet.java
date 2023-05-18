import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NewSet {

    public static void main(String[] args) {
        Set<String> newHashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        newHashSet.add("A");
        newHashSet.add("B");
        newHashSet.add("C");
        newHashSet.add("D");

        System.out.println("HashSet----------");

        for(String name : newHashSet){
            System.out.println("name:"+name);
        }

        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");

        System.out.println("LinkedHashSet----------");

        for(String name : linkedHashSet){
            System.out.println("name:"+name);
        }


        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");

        System.out.println("TreeSet----------");

        for(String name : treeSet){
            System.out.println("name:"+name);
        }

    }
}
