package ru.skillbox;

public class Screen {
    private final double diagonal;
    private final String type;
    private final double weight;

    public Screen(double diagonal, String type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public Screen setDiagonal(double diagonal) {
        return  new Screen(diagonal, type, weight);
    }

    public String getType() {
        return type;
    }

    public Screen setType(String type) {
        return  new Screen(diagonal, type, weight);
    }

    public double getWeight() {
        return weight;
    }

    public Screen setWeight(double weight) {
        return  new Screen(diagonal, type, weight);
    }
    public String toString(){
        return "Хараткеристика Дисплея: " + "\n" +
                "Диагональ экрана:  " + diagonal + " In" + "\n" +
                "Тип экрана: " + type + "\n" +
                "Вес экрана: " + weight + " гр." + "\n";
    }
}
