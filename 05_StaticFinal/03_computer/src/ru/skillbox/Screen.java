package ru.skillbox;

public class Screen {

    private final double diagonal;
    private final double weight;

    public Screen(double diagonal, double weight) {
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public Screen setDiagonal(double diagonal) {
        return  new Screen(diagonal, weight);
    }

    public double getWeight() {
        return weight;
    }

    public Screen setWeight(double weight) {
        return  new Screen(diagonal, weight);
    }

    public String toString(){
        return "Хараткеристика Дисплея: " + "\n" +
                "Диагональ экрана:  " + diagonal + " In" + "\n" +
                "Тип экрана: " + TypeComponents.TN + "\n" +
                "Вес экрана: " + weight + " гр." + "\n";
    }
}
