package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i3-3217U",1.80,4,20.45);
        RAM ram = new RAM(8,10.24);
        HardDisk hardDisk = new HardDisk( 750,77.26);
        Screen screen = new Screen(15.6,535.24);
        Keyboard keyboard = new Keyboard( 154.31,"Нет");
        Computer computer = new Computer("Тайвань","Asus",processor,ram,hardDisk,screen,keyboard);
        System.out.println(computer);
        System.out.print("Общий вес компьютера: " + computer.getTotalWeight() + " гр." + "\n" );
    }
}
