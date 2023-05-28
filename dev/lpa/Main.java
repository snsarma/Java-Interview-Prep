package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

//        animal.move(); // animal's move() signature exists
////        ((Bird) animal).takeOff(); // Only Bird has access to interface's methods
////        ((Bird) animal).land();
////        ((Bird) animal).fly();
//
////        flightEnabled.move(); Doesn't compile , Compiler only cares declared types
////        trackable.move(); Both these interfaces don't have move() so doesn't work !!
//
//        flightEnabled.fly(); // Part of FlightEnabled interface
//        flightEnabled.takeOff();
//        flightEnabled.land();
//
//        trackable.track(); // Part of Trackable interface

        inFlight(flightEnabled); //
        inFlight(new Jet());
        Trackable truck = new Truck() ; // Object of Truck's class assigned to Trackable Interface
        truck.track();

        double milesTraveled = 100;
        double totalMiles = milesTraveled*FlightEnabled.KM_TO_MILES; // The way interface variables are accessed
        System.out.println("totalMiles:"+totalMiles);

        LinkedList<FlightEnabled> flightEnabledTypes = new LinkedList<>();
        flightEnabledTypes.add(bird);

        List<FlightEnabled> flightEnabledList = new ArrayList<>();
        flightEnabledList.add(bird);

        System.out.println("---Flight Enabled Types----");
        triggerFliers(flightEnabledTypes);
        flyFliers(flightEnabledTypes);
        landFliers(flightEnabledTypes);


        System.out.println("---Flight Enabled Lists----");
        triggerFliers(flightEnabledList);
        flyFliers(flightEnabledTypes);
        landFliers(flightEnabledTypes);

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();

        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();

    }

    private static void triggerFliers(List<FlightEnabled> fliers){

        for (var flier: fliers) {
            flier.takeOff();
        }

    }

    private static void flyFliers(List<FlightEnabled> fliers){

        for (var flier: fliers) {
            flier.fly();
        }

    }

    private static void landFliers(List<FlightEnabled> fliers){

        for (var flier: fliers) {
            flier.land();
        }

    }

}
