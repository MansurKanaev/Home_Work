package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        CourierService courierService = new CourierService(50,"Ул. Мотросова № 52",
                "Товар хрупкий.","2345321");
        Dimensions dimensions = new Dimensions();
        dimensions.cargoVolume(25,15,35);




    }
}
