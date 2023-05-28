package dev.lpa;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+"------ Take Off !!!--------");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+"------ Land !!!--------");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+"------ Fly !!!--------");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"-------- Track !!! --------");
    }

    @Override
    public FlightStates transition(FlightStates flightStates) { // Deafult method implementation has blue arrow
       // return FlightEnabled.super.transition(flightStates); // the default method in the interface is invoked
//        System.out.println(getClass().getSimpleName()+"------- transitioning");
//        return FlightStates.CRUISE;
        FlightStates nextState = flightStates.getNextState();
        System.out.println(" Transitioning  from " + flightStates + " To " + nextState);
        return nextState;
    }
}
