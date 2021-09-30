package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Тайвань", "Asus");

        RAM ram = new RAM("DDR3",8,10.24);
        HardDisk hardDisk = new HardDisk("HDD", 750,77.26);
        Screen screen = new Screen(15.6,"TN",535.24);
        Keyboard keyboard = new Keyboard("Мембранная", 154.31,"Нет");
        System.out.println();
        System.out.println(computer.toString());
        System.out.println();
        System.out.println(ram.toString());
        System.out.println(hardDisk.toString());
        System.out.println(screen.toString());
        System.out.println(keyboard.toString());
        System.out.println("Общий вес компьютера: " + computer.totalWeightComputer() + " гр." );

    }
}
