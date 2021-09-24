package ru.skillbox;

public class CourierService {

        private final int weight;
        private final String deliveryAddress;
        private final String commodityProperty;
        private final String registrationNumber;
        private final String loadStrength;

    public CourierService(int weight, String deliveryAddress, String commodityProperty,
                          String registrationNumber, String loadStrength) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.commodityProperty = commodityProperty;
        this.registrationNumber = registrationNumber;
        this.loadStrength = loadStrength;

    }
    public CourierService setWeight(int weight) {
        return new CourierService(weight,deliveryAddress,commodityProperty,registrationNumber,
                loadStrength);
    }
    public int getWeight() {
        return weight;
    }
    public CourierService setDeliveryAddress(String deliveryAddress) {
        return  new CourierService(weight,deliveryAddress,commodityProperty,registrationNumber,
                loadStrength);
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
    public String getLoadStrength() {
        return loadStrength;
    }

    public void String(){
        System.out.println("Масса: " + weight + " кг" + "\n"
                + "Адрес доставки: " + deliveryAddress + "\n"
                + "Свойство товара: " + commodityProperty + "\n"
                + "Регистрационный номер: " + registrationNumber + "\n"
                + "Прочность товара: " + loadStrength);

    }
}


