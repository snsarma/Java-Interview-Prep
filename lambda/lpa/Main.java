package lambda.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> person = new ArrayList<>(Arrays.asList(new Person("Bruce", "Willis"),
                new Person("Michael", "Douglas"),
                new Person("John", "Wick")));

        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o1.lastName()).compareTo(o2.lastName());
            }
        };

//        person.sort(comparatorLastName);
//        person.sort( new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return (o1.lastName()).compareTo(o2.lastName());
//            }
//        }); // Anonymous class

        person.sort((o1, o2) -> (o1.lastName()).compareTo(o2.lastName())); // Replaced by Lambda expression

        System.out.println("person sorted :"+person);

        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1,T o2);
        }

        var comparatorMix = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {

                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1,o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        person.sort(comparatorMix);
        System.out.println("comparatorMix:"+person);
    }
}
