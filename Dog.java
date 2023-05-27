public class Dog extends Animal {

    Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed == "slow") {
            System.out.println(getExplicitType() + "lazily");

        } else {
            System.out.println(getExplicitType() + "hurriedly");
        }

    }

    @Override
    public void makeNoise() {

        if (type == "Wolf")
            System.out.println("Howling!");
        else
            System.out.println("Barking");

    }
}
