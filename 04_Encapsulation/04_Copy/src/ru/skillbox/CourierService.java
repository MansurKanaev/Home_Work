package ru.skillbox;

public class CourierService {
    private  int dimension;
    private final int weight;
    private final String deliveryAddress;
    private final String commodityProperty;
    private final String registrationNumber;

    public CourierService(int weight, String deliveryAddress,
                          String commodityProperty, String registrationNumber) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.commodityProperty = commodityProperty;
        this.registrationNumber = registrationNumber;

        System.out.println("Масса: " + weight + " кг" + "\n"
                + "Адрес доставки: " + deliveryAddress + "\n"
                + "Свойство товара: " + commodityProperty + "\n"
                + "Регистрационный номер: " + registrationNumber);
    }

    public int getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getCommodityProperty() {
        return commodityProperty;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


}
class Dimensions {
    private int width;
    private int height;
    private int length;
    private  int volume;

    public void cargoVolume (int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;

        volume = width * height * length;
        System.out.println("Габариты: " + "Ширина = " + width + " см, "
                + "Высота = " + height + " см, " + "Длина = " + length + " см, ");
        System.out.println("Объем груза: " + volume + " см3");

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

    public int getVolume() {
        return volume;
    }

}

