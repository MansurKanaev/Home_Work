package ru.skillbox;

public class DescriptionCargo {

        private final Dimensions dimensions ;
        private final int weight;
        private final String deliveryAddress;
        private final String commodityProperty;
        private final String registrationNumber;
        private final String loadStrength;


    public DescriptionCargo (int weight, String deliveryAddress, String commodityProperty,
                             String registrationNumber, String loadStrength, Dimensions dimensions) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.commodityProperty = commodityProperty;
        this.registrationNumber = registrationNumber;
        this.loadStrength = loadStrength;
        this.dimensions = dimensions;
    }
    public DescriptionCargo setWeight(int weight) {
        return new DescriptionCargo (weight,deliveryAddress,commodityProperty,registrationNumber,
                loadStrength, dimensions );
    }
    public int getWeight() {
        return weight;
    }
    public DescriptionCargo setDeliveryAddress(String deliveryAddress) {
        return  new DescriptionCargo (weight,deliveryAddress,commodityProperty,registrationNumber,
                loadStrength, dimensions);
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
    public Dimensions getDimensions() {
        return dimensions;
    }
    public void String(){
        System.out.println("Масса: " + weight + " кг" + "\n"
                + "Адрес доставки: " + deliveryAddress + "\n"
                + "Свойство груза: " + commodityProperty + "\n"
                + "Регистрационный номер: " + registrationNumber + "\n"
                + "Прочность груза: " + loadStrength);
    }
}


