package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    public double totalWeight;
    public final Processor processor;
    public final RAM ram;
    public final HardDisk hardDisk;
    public final Screen screen;
    public final Keyboard keyboard;

    public Computer(String vendor, String name,Processor processor, RAM ram,
                    HardDisk hardDisk, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.screen =screen;
        this.keyboard = keyboard;
    }

    public  double getTotalWeight(){
     totalWeight = (processor.getWeight() +
             ram.getWeight() +
             hardDisk.getWeight() +
             screen.getWeight() +
             keyboard.getWeight());
     return totalWeight ;
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(vendor, name,processor, ram, hardDisk, screen, keyboard);
    }

    public Computer setRam(RAM ram) {
        return new Computer(vendor, name,processor, ram, hardDisk, screen, keyboard);
    }

    public Computer setHardDisk(HardDisk hardDisk) {
        return new Computer(vendor, name,processor, ram, hardDisk, screen, keyboard);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(vendor, name,processor, ram, hardDisk, screen, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name,processor, ram, hardDisk, screen, keyboard);
    }

    public String getVendor() {
        return vendor;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, processor, ram, hardDisk, screen,keyboard);
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, processor, ram, hardDisk, screen,keyboard);
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
                "Модель компьютера: " + name + "\n" + "\n" + processor.toString() + "\n" +
                ram.toString() + "\n" +
                hardDisk.toString() + "\n" +
                screen.toString() +  "\n" +
                keyboard.toString() ;
    }
}
