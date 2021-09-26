package ru.skillbox;

public class Dimensions {

    private final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Dimensions(Dimensions widths, Dimensions setHeight, Dimensions setLength){
        width =0;
        height=0;
        length=0;
    }

    public  Dimensions setWidth(int width) {
        return new Dimensions(width,height,length);
    }
    public  Dimensions setHeight(int height) {
        return new Dimensions(width,height,length);
    }
    public  Dimensions setLength(int length) {
       return new Dimensions(width,height,length);

    }
    public int volume(){
        return width * height * length;

    }
    public int getWidth(int dimensions) {
        return width;
    }
    public int getHeight(int dimensions) {
        return height;
    }
    public int getLength(int dimensions) {
        return length;
    }

    public String toString(){
        return
                "Ширина: " + width + " см " + "\n" +
                "Высота: " + height + " см " + "\n" +
                "Длина: " + length + " см " + "\n" +
                "Объем груза: " + volume() + " см3 ";
    }
}


