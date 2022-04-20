package ru.skillbox;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(
                3,
                4,
                2);
        DescriptionCargo descriptionCargo = new DescriptionCargo(
                100,
                "ул. Щорса 24.",
                "не поворачивать!",
                "001234",
                "товар хрупкий!",
                dimensions);

        descriptionCargo = descriptionCargo.setWeight(50);
        descriptionCargo = descriptionCargo.setDeliveryAddress("ул. Мотросова 9");
        descriptionCargo.String();
        System.out.println(dimensions);
    }
}

