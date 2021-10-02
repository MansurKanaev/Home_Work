package ru.skillbox;

public class HardDisk {
    private final int volume;
    private final double weight;

    public HardDisk(int volume, double weight) {
        this.volume = volume;
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public HardDisk setVolume(int volume) {
        return new HardDisk(volume, weight);
    }

    public double getWeight() {
        return weight;
    }

    public HardDisk setWeight(double weight) {
        return new HardDisk(volume, weight);
    }

    public String toString(){
        return "Характеристика жесткого диска: " + "\n" +
                "Тип Ж/д: " + TypeComponents.HDD + "\n" +
                "Объем Ж/д: " + volume + " Гб" + "\n" +
                "Вес Ж/д: " + weight + "гр." + "\n";
    }
}
