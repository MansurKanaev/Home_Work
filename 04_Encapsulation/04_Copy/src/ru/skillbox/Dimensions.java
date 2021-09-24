package ru.skillbox;

public class Dimensions {

    private final int width;
    private final int height;
    private final int length;
    private final int dimensions = 0;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Dimensions setDimensions(int dimensions) {
        dimensions = dimensions + (width * height * length);
        System.out.println("Объем товара: " + dimensions + " М3");
        return new Dimensions(width,height,length);

    }
    public Dimensions setWidth(int width) {
        return new Dimensions(width,height,length);
    }
    public Dimensions setHeight(int height) {
        return new Dimensions(width,height,length);
    }
    public Dimensions setLength(int length) {
       return new Dimensions(width,height,length);
    }
    public int getDimensions() {
        return dimensions;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
}


