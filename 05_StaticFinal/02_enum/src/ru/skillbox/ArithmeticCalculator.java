package ru.skillbox;

public class ArithmeticCalculator {
    private final int x;
    private final int y;
    private int result;
    private Operation operation;

    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                result = x + y;
                break;
            case MULTIPLY:
                result = x * y;
                break;
            case SUBTRACT:
                result = x - y;
                break;
        }
        System.out.println(result);
    }
}
