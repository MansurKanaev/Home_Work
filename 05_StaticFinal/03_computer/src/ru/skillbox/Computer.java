package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    private  Processor processor;
    private  RAM ram;
    private  HardDisk hardDisk;
    private  Screen screen;
    private  Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
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
