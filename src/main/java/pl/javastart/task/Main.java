package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i5-12400F", "Intel", 123123, 4000, 70, 85);
        Memory memory = new Memory("KINGSTON FURY BEAST", "Kingston", 122222, 8, 3200, 80, 125);
        HardDrive hardDrive = new HardDrive("Samsung 980 M.2", "Samsung", 88888, 1000);
        Computer computer = new Computer(processor, memory, hardDrive);

        try {
            computer.getMemory().overclock();
            computer.getMemory().overclock();
            computer.getMemory().overclock();
            computer.getProcessor().overclock();
            computer.getProcessor().overclock();
        } catch (HighTemperatureException e) {
            System.err.println(e.getMessage());
        }
    }
}
