import java.util.Random;

public class EnumExample {

    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.FRI;
        System.out.println("dayOfTheWeek"+" "+dayOfTheWeek);
        for(int i = 0; i < 10; i++){
            dayOfTheWeek = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value =%d%n",dayOfTheWeek.name(),dayOfTheWeek.ordinal());
            //Prints the Name and the value associated with it
        }

        for(Topping topping : Topping.values()){
            System.out.println(topping.name()+"----"+topping.getPrice(topping));
        }

    }

    public static DayOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];

    }
}
