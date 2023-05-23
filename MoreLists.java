import java.sql.SQLOutput;
import java.util.ArrayList;
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

    }


}
