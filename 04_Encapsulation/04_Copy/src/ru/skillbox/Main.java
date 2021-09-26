package ru.skillbox;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2,5,3);

        DescriptionCargo descriptionCargo = new DescriptionCargo(100,"ул. Щорса 24.",
                "не поворачивать!", "001234","товар хрупкий!",
                 dimensions);

        descriptionCargo = descriptionCargo.setWeight(50);
        descriptionCargo = descriptionCargo.setDeliveryAddress("ул. Мотросова 9");
        descriptionCargo.String();
        dimensions.setWidth(3);
        dimensions.setHeight(3);
        dimensions.setLength(3);





    }
}
