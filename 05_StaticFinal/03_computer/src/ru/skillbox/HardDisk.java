package ru.skillbox;

public class HardDisk {
    private final String type;
    private final int volume;
    private final double weight;

    public HardDisk(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public HardDisk setType(String type) {
       return new HardDisk(type, volume, weight);
    }

    public int getVolume() {
        return volume;
    }

    public HardDisk setVolume(int volume) {
        return new HardDisk(type, volume, weight);
    }

    public double getWeight() {
        return weight;
    }

    public HardDisk setWeight(double weight) {
        return new HardDisk(type, volume, weight);
    }
    public String toString(){
        return "Характеристика жесткого диска: " + "\n" +
                "Тип Ж/д: " + type + "\n" +
                "Объем Ж/д: " + volume + " Гб" + "\n" +
                "Вес Ж/д: " + weight + "гр." + "\n";
    }
}
