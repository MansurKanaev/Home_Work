package ru.skillbox;

public class Processor {
    private final String manufacturer;
    private final double frequency;
    private final int numberCores;
    private final double weight = 20.45;

    public Processor(String manufacturer, double frequency, int numberCores){
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.numberCores = numberCores;
    }
    public double processorWeight(){
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Processor setManufacturer(String manufacturer) {
       return new Processor(manufacturer, frequency, numberCores);
    }

    public Processor getFrequency() {
        return new Processor(manufacturer, frequency, numberCores);
    }

    public Processor setFrequency(double frequency) {
        return new Processor(manufacturer, frequency, numberCores);
    }

    public int getNumberCores() {
        return numberCores;
    }

    public Processor setNumberCores(int numberCores) {
        return new Processor(manufacturer, frequency, numberCores);
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Характеристика Центрального процессора: " + "\n" +
                "Модель ЦП: " + manufacturer + "\n" +
                "Частота ЦП: " + frequency + " MHz" + "\n" +
                "Количество ядер ЦП: " + numberCores + " яд." + "\n" +
                "Вес ЦП: " + weight + " гр." + "\n" ;
    }
}
