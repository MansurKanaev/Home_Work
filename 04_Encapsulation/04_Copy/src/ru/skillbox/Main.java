package ru.skillbox;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions Dimensions = new Dimensions(3,4,6);
        DescriptionCargo descriptionCargo = new DescriptionCargo(100,"Щорса 24.",
                "не поворачивать!", "001234","товар хрупкий!",
                 Dimensions);
       descriptionCargo = descriptionCargo.setWeight(50);
       descriptionCargo = descriptionCargo.setDeliveryAddress("мотросова 9");
       descriptionCargo.String();
       Dimensions copy = new Dimensions(Dimensions.setWidth(3),Dimensions.setHeight(2),Dimensions.setLength(1));
       System.out.println(Dimensions.toString());











    }
}
