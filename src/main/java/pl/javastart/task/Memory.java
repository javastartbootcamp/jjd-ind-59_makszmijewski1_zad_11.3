package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private double amount;
    private double timing;
    private double temperature;
    private final double maximumTemperature;
    private static final double INCREASE_TEMPERATURE = 15;
    private static final double INCREASE_TIMING = 100;

    public Memory(String model, String producer, int serialNumber, double amount, double timing, double temperature, double maximumTemperature) {
        super(model, producer, serialNumber);
        this.amount = amount;
        this.timing = timing;
        this.temperature = temperature;
        this.maximumTemperature = maximumTemperature;
    }

    @Override
    public void overclock() {
        if (temperature + INCREASE_TEMPERATURE > maximumTemperature) {
            throw new HighTemperatureException("Nie można zwiększyć taktowania pamięci RAM, za duża temperatura!");
        }
        temperature += INCREASE_TEMPERATURE;
        timing += INCREASE_TIMING;
    }
}
