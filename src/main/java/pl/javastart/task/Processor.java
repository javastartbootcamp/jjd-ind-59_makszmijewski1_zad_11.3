package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    private double timing;
    private double temperature;
    private final double maximumTemperature;
    private static final double INCREASE_TEMPERATURE = 10;
    private static final double INCREASE_TIMING = 100;

    public Processor(String model, String producer, int serialNumber, double timing, double temperature, double maximumTemperature) {
        super(model, producer, serialNumber);
        this.timing = timing;
        this.temperature = temperature;
        this.maximumTemperature = maximumTemperature;
    }

    @Override
    public void overclock() {
        if (temperature + INCREASE_TEMPERATURE > maximumTemperature) {
            throw new HighTemperatureException("Nie można zwiększyć taktowania procesora, za duża temperatura!");
        }
        temperature += INCREASE_TEMPERATURE;
        timing += INCREASE_TIMING;
    }
}
