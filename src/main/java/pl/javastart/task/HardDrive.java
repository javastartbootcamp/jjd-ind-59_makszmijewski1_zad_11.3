package pl.javastart.task;

public class HardDrive extends Component {
    private double capacity;

    public HardDrive(String model, String producer, int serialNumber, double capacity) {
        super(model, producer, serialNumber);
        this.capacity = capacity;
    }
}
