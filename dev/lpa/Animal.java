package dev.lpa;

enum FlightStates implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring :" + this);
        }

    }

    public FlightStates getNextState(){
        FlightStates[] allStates = values();

        return allStates[(ordinal()+1) % allStates.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


class Satellite implements OrbitEarth {
    @Override
    public void achieveOrbit() {
        System.out.println("-----Orbit achieved-----");
    }

    @Override
    public void takeOff() {
        System.out.println("-----Satellite Take Off----");
    }

    @Override
    public void land() {
        System.out.println("-----Satellite Land----");
    }

    @Override
    public void fly() {
        System.out.println("-----Satellite Fly----");
    }
}


interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
    private static void log(String description){

        var today = new java.util.Date();
        System.out.println("Today's date:"+today);
        System.out.println("Description:"+description);
    }
}

interface FlightEnabled {

    double MILES_TO_KM = 0.5; // By Default, they are public,static and final
    double KM_TO_MILES = 1.5;

    void takeOff();         // Methods are public and abstract

    void land();

    void fly();

    // Backward compatibility , implementation provided
    default FlightStates transition(FlightStates flightStates) { // This method needs no implementation in the classes/interfaces
        System.out.println("transition not implemented on" + getClass().getName());
        return null;
    }
}

interface Trackable {

    void track();
}


public abstract class Animal {

    public abstract void move();
}
