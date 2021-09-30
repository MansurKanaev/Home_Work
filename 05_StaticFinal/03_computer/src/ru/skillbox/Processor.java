package ru.skillbox;

public class Processor {
    private final String manufacturer = "Intel Core i3-3217U" ;
    private final double frequency = 1.80 ;
    private final int numberCores = 4 ;
    private final double weight = 20.45 ;

    public Processor() {

    }

    public String getManufacturer() {
        return manufacturer;
    }



    public Processor getFrequency() {
        return new Processor();
    }



    public int getNumberCores() {
        return numberCores;
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
