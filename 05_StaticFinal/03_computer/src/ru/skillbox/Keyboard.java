package ru.skillbox;

public class Keyboard {
    private final double weight;
    private final String backlight;

    public Keyboard(double weight, String backlight) {
        this.weight = weight;
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(weight, backlight);
    }

    public String getBacklight() {
        return backlight;
    }

    public Keyboard setBacklight(String backlight) {
        return new Keyboard( weight, backlight);
    }

    public String toString(){
        return "Характиристика клавиатуры: " + "\n" +
                "Тип: " + TypeComponents.МЕМБРАННАЯ + "\n" +
                "Имеет подсветку: " + backlight + "\n" +
                "Вес: " + weight + " гр.";
    }
}
