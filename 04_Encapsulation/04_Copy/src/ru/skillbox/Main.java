package ru.skillbox;

public class Main {
    public static void main(String[] args) {
        CourierService courierService = new CourierService(100,"Щорса 24.",
                "не поворачивать!", "001234","товар хрупкий!");
        courierService = courierService.setWeight(50);
        courierService = courierService.setDeliveryAddress("мотросова 9");
        courierService.String();
        Dimensions dimensions = new Dimensions(3,4,6);
        dimensions = dimensions.setHeight(2);
        dimensions = dimensions.setLength(5);
        dimensions = dimensions.setWidth(3);
        dimensions.setDimensions(0);





    }
}
