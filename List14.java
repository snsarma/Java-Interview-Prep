import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name,String type,int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1); // name is dynamic , rest are as is
    }
}
public class List14 {

    public static void main(String[] args) {
        GroceryItem [] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Cheese");
        groceryArray[1] = new GroceryItem("apple","PRODUCE",6);
       groceryArray[2] = new GroceryItem("5 oranges","PRODUCE",10);
        //groceryArray[2] = "5 oranges";
        System.out.println("GroceryArray"+ Arrays.toString(groceryArray));

        List<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("Cheese"));
        groceryList.add(new GroceryItem("apple","PRODUCE",6));
       // groceryList.add( new GroceryItem("5 oranges","PRODUCE",5));

        groceryList.set(0, new GroceryItem("5 oranges","PRODUCE",5));
        // Replaces the element at the 0th index
        groceryList.remove(1); // removes element at index 1
        for (GroceryItem groceryItem: groceryList) {
            System.out.println("groceryItem :"+groceryItem);
        }
    }


}
