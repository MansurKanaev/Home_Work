package ru.skillbox;

public class Keyboard {
    private final String type;
    private final double weight;
    private final String backlight;

    public Keyboard(String type, double weight, String backlight) {
        this.type = type;
        this.weight = weight;
        this.backlight = backlight;
    }

    public String getType() {
        return type;
    }

    public Keyboard setType(String type) {
        return new Keyboard(type, weight, backlight);
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(type, weight, backlight);
    }

    public String getBacklight() {
        return backlight;
    }

    public Keyboard setBacklight(String backlight) {
        return new Keyboard(type, weight, backlight);
    }
    public String toString(){
        return "Характиристика клавиатуры: " + "\n" +
                "Тип: " + type + "\n" +
                "Имеет подсветку: " + backlight + "\n" +
                "Вес: " + weight + " гр." + "\n";
    }
}
