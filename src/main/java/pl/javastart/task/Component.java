package pl.javastart.task;

public abstract class Component {
    protected String model;
    protected String producer;
    protected int serialNumber;

    public Component(String model, String producer, int serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }
}
