package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    private final Processor processor;
    private final RAM ram;
    private final HardDisk hardDisk;
    private final Screen screen;
    private final Keyboard keyboard;

    public Computer(String vendor, String name ) {
        this.vendor = vendor;
        this.name = name;
        processor = getProcessor();
        ram = getRam();
        hardDisk = getHardDisk();
        screen = getScreen();
        keyboard = getKeyboard();
    }

    public double totalWeightComputer(){
        return  processor.getWeight() +
                ram.getWeight() +
                hardDisk.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
    }

    public String getVendor() {
        return vendor;
    }
    public Computer setVendor(String vendor) {
        return new Computer(vendor, name);
    }
    public String getName() {
        return name;
    }
    public Computer setName(String name) {
        return new Computer(vendor, name);
    }
    public Processor getProcessor() {
        return processor;
    }
    public RAM getRam() {
        return ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
    public String toString(){
        return "Производитель компьютера : " + vendor + "\n" +
                "Модель компьютера: " + name + "\n" ;
    }
}
