package composition.computerFactory;

public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }
}
