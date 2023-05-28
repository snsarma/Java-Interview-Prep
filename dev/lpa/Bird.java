package dev.lpa;

public class Bird extends Animal implements FlightEnabled,Trackable{

    @Override
    public  void move(){
        System.out.println(" Flaps wings !!!!!");
    }

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
}
