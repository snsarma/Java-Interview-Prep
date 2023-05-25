import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String [] items = {"apples","melons","lemon"};

        List<String> list = List.of(items);
        System.out.println("list:"+list);
        System.out.println(list.getClass().getName()); // Shows Immutable
        ArrayList<String> groceryList = new ArrayList<>(list); // List of Strings assigned to ArrayList
        groceryList.add("yogurt");
        System.out.println("groceryList:"+groceryList);
        ArrayList<String> nextList = new ArrayList<>(List.of("pancakes","maple syrup","sugar free snacks"));
        groceryList.addAll(nextList);
        groceryList.add("apples");
        System.out.println("groceryList after addition"+groceryList);
        System.out.println("groceryList(2)"+groceryList.get(2));
        if(groceryList.contains("pancakes")){
            System.out.println("It contains pancakes");
        }
        System.out.println("First index of apples"+groceryList.indexOf("apples"));
        System.out.println("First index of apples"+groceryList.lastIndexOf("apples"));

        System.out.println("-------Grocery List Before Removal---------");
        System.out.println("groceryList"+groceryList);
        groceryList.remove(1);
        groceryList.remove("pancakes");

        System.out.println("-------Grocery List After  Removal---------");
        System.out.println("groceryList"+groceryList);

        groceryList.removeAll(List.of("lemon","maple syrup"));
        System.out.println("groceryList"+groceryList);

        groceryList.clear();
        System.out.println("groceryList after clear"+groceryList);
        System.out.println("Is it empty?:"+groceryList.isEmpty());

        groceryList.addAll(List.of("Canary","Cantaloupe","Avocado"));
        groceryList.addAll(Arrays.asList("Musk","Ice","Berries"));

        System.out.println("groceryList"+groceryList);
        groceryList.sort(Comparator.naturalOrder()); // Comparator's natural order
        System.out.println("groceryList after sorting"+groceryList);

        System.out.println("-----Reverse Sorting------");
        groceryList.sort(Comparator.reverseOrder()); // Comparator's reverse order
        System.out.println("groceryList after sorting"+groceryList);
    }


}
