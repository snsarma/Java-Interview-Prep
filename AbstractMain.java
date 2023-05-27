import java.util.ArrayList;

public class AbstractMain {


    public static void main(String[] args) {

        //Animal animal = new Animal("animal","big",100)

          Dog dog = new Dog("Wolf","big",100.0);
          dog.makeNoise();
          dog.move("slow");
          doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd","big",150.0));
        animals.add(new Fish("GoldFish","small",34.0));
        animals.add(new Fish("Barracuda","big",44.0));
        animals.add(new Horse("Clydesdale","Medium",200));


        for(Animal animal : animals){
            doAnimalStuff(animal);
            System.out.println("explicit type"+animal.getExplicitType());
//            if(animal.getExplicitType() == "Clydesdale"){
//                System.out.println("Horse method invoked.");
//            }
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }

//            @Override
//            public void move(String speed) {
//
//            }
//
//            @Override
//            public void makeNoise() {
//
//            }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }


}
