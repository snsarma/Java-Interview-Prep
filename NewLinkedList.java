import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class NewLinkedList {

    public static void main(String[] args) {
       List<String> newLinkedList = new LinkedList<>();
       // var newLinkedList = new LinkedList<String>(); // Alt way of desclaring a linked list
        newLinkedList.add("Canberra");
        newLinkedList.add(0,"Sydney");
        System.out.println("newLinkedList"+newLinkedList);
        addMoreElements((LinkedList<String>) newLinkedList);
        // addMoreElements(newLinkedList);
        System.out.println("newLinkedList after method call"+newLinkedList);

        retrieveElements((LinkedList<String>) newLinkedList);

//        removeMoreElements((LinkedList<String>) newLinkedList);
//        System.out.println("newLinkedList after remove Elements"+newLinkedList);

        //printItinerary((LinkedList<String>) newLinkedList);
        System.out.println("---Iterator Itinerary-------");
        iteratorItinerary((LinkedList<String>) newLinkedList);

        System.out.println("--- Test Iterator -------");
        testIterator((LinkedList<String>) newLinkedList);

    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Hobart");
        list.addLast("Melbourne");

        // Queue methods , List emulating a Queue
        list.offer("Perth"); // adds at the last
        list.offerFirst("Wellington"); // Adds at the beginning of the queue
        list.offerLast("Nottingham"); // adds at the end of the queue
    }

    private static void removeMoreElements(LinkedList<String> list){
       list.remove(2);
       list.remove("Nottingham");

       String s1 = list.remove();
        System.out.println("s1:"+s1);

        // remove and removeFirst are almost identical
        String s2 = list.removeFirst();
        System.out.println("s2:"+s2);

        String s3 = list.removeLast(); // removes last element in the list
        System.out.println("s3:"+s3);

        String p1 = list.poll(); // poll and pollFirst are the same
        System.out.println("p1:"+p1);

        String p2 = list.pollFirst();
        System.out.println("p2:"+p2);

        String p3 = list.pollLast(); // removes the last element poll is a queue method
        System.out.println("p3:"+p3);

        list.push("West Windsor");
        list.push("Piscataway");
        list.push("Edison");
        list.push("Iselin");

        System.out.println("list after push"+list);

        String p4 = list.pop();
        System.out.println("p4:"+p4);


    }

    private static void retrieveElements(LinkedList<String> list) {

        System.out.println("list using get"+list.get(4));
        System.out.println("list using get first"+list.getFirst());
        System.out.println("list using get last"+list.getLast());

        System.out.println("Index of Sydney"+list.indexOf("Sydney"));
        System.out.println("Index of Perth"+list.indexOf("Perth"));

        //Retrieves the first element Queue
        System.out.println("Element method on list"+list.element());

       // Stack retrieval methods
        System.out.println("Peek method on list"+list.peek());
        System.out.println("Peek First method on list"+list.peekFirst());
        System.out.println("Peek Last method on list"+list.peekLast());

        System.out.println("list after peek methods"+list);
    }

    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip start at----"+list.getFirst());
        for(int i = 1; i <= list.size()-1 ; i++){
            System.out.println("Travel from ->"+list.get(i-1)+" To-->"+list.get(i));
        }
        System.out.println("Trip ends with---"+list.getLast());

    }

    private static void iteratorItinerary(LinkedList<String> list){

        String previousTown = list.getFirst();

        ListIterator<String> listIterator = list.listIterator(1);

        while (listIterator.hasNext()){
            String town = listIterator.next();
            System.out.println("Travel from ->"+previousTown+" To-->"+town);
            previousTown = town;
        }
    }

    private static void testIterator(LinkedList<String> list){
        //var iterator = list.iterator(); // Iterator only allows you to remove elements , not add
        var iterator = list.listIterator(); // List Iterator allows you to add elements

        while(iterator.hasNext()){
            //String element = iterator.next();
//            System.out.println("element:"+element);
            if(iterator.next().equals("Perth")){
                iterator.remove(); // only method allowed for iterator to make changes on the List
            }
        }

        // Iterator is pointing to the end of the list at this point
        while(iterator.hasPrevious()){
            String element = iterator.previous();
          System.out.println("element:"+element);
        }
        System.out.println("list :"+list);

    }

    }
