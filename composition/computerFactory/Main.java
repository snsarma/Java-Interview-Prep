package composition.computerFactory;


import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch HD","HP",27,"1230*540");
        MotherBoard theMotherBoard = new MotherBoard("2345 M1","Intel",
                12,23,"v-2.45");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                                            theCase, theMonitor, theMotherBoard);
        thePC.getMonitor().drawPixelAt(110,250,"Black");// Composition
        thePC.getMotherboard().loadProgram("Chrome");
        thePC.getComputerCase().pressPowerButton();


    }
}
