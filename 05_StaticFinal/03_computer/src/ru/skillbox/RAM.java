package ru.skillbox;

public class RAM {

    private final int volume;
    private final double weight;

    public RAM(int volume, double weight) {
        this.volume = volume;
        this.weight = weight;
    }

    public double RAMWeight(){
        return weight;
    }

    public int getVolume() {
        return volume;
    }

    public RAM setVolume(int volume) {
        return new RAM(volume,weight);
    }

    public double getWeight() {
        return weight;
    }

    public RAM setWeight(double weight) {
        return new RAM(volume,weight);
    }

    public String toString(){
        return "Характеристика Оперативной памяти: " + "\n" +
                "Тип ОЗУ: " + TypeComponents.DDR3 + "\n" +
                "Объем ОЗУ: " + volume + " гб" + "\n" +
                "Вес ОЗУ: " + weight + "гр." + "\n";

    }
}
