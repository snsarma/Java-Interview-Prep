abstract class Mammal extends Animal{ // An abstract class extending another abs class

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType()+"");
        System.out.println(speed.equals("slow")? "walks": "runs");
    }

    public abstract void shedHair();
}
public abstract class Animal {

    protected String type;

    private String size;

    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed); // can't be private since they need to be overridden
    public abstract void makeNoise();

    public  String getExplicitType(){
        return getClass().getName()+"("+type+")";
    }
}
