public class Fish extends Animal {

    Fish(String type, String size, double weight) {
        super(type, size, weight);
    }


    @Override
    public void move(String speed) {
        if (speed == "slow") {
            System.out.println(getExplicitType() + " lazily");

        } else {
            System.out.println(getExplicitType() + " hurriedly");
        }

    }

    @Override
    public void makeNoise() {

        if (type == "GoldFish")
            System.out.println("Swish!");
        else
            System.out.println("Splash");

    }
}
