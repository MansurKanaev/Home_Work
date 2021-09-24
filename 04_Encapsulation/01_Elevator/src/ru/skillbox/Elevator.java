package ru.skillbox;

public class Elevator {

    private  int currentFloor = 1;
    private  int minFloor;
    private  int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Ошибка. Выберите правельный этаж:");
            return;
        }
        while (currentFloor < floor) {
            System.out.println(currentFloor);
            moveUp();
        }
        while (currentFloor > floor) {
            System.out.println(currentFloor);
            moveDown();
        }
        System.out.println("Текущий этаж:" + floor);
    }
}









